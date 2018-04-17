package wannshan.springb.service.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import wannshan.springb.model.TSysRole;
import wannshan.springb.model.TSysUser;
import wannshan.springb.service.mapper.UserMapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 文件功能：xxxx
 *
 */
public class CustomUserDetailsService implements UserDetailsService {


    private final  Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<UserDetails> users = loadUsersByUsername(username);

        if (users.size() == 0) {
            this.logger.debug("Query returned no results for user '" + username + "'");

            throw new UsernameNotFoundException("Username {0} not found");
        }

        UserDetails user = users.get(0); // contains no GrantedAuthority[]

        Set<GrantedAuthority> dbAuthsSet = new HashSet<>();
         //授权role
        dbAuthsSet.addAll(loadUserAuthorities(user.getUsername()));
        List<GrantedAuthority> dbAuths = new ArrayList<>(dbAuthsSet);

        if (dbAuths.size() == 0) {
            this.logger.debug("User '" + username
                    + "' has no authorities and will be treated as 'not found'");
            throw new UsernameNotFoundException("User {0} has no GrantedAuthority");
        }

        return createUserDetails(username, user, dbAuths);

    }

    protected UserDetails createUserDetails(String username,
                                            UserDetails userFromUserQuery, List<GrantedAuthority> combinedAuthorities) {
        String returnUsername = userFromUserQuery.getUsername();
        return new User(returnUsername, userFromUserQuery.getPassword(),
                userFromUserQuery.isEnabled(), true, true, true, combinedAuthorities);
    }

    protected List<UserDetails> loadUsersByUsername(String username) {

        List<TSysUser> users=userMapper.loadUsersByUsername(username);
        List<UserDetails> userDetails= new ArrayList<>();
        for(TSysUser user:users){
            boolean enabled = user.getEnabled()!=null?user.getEnabled().intValue()>0:false;
            User _user= new User(user.getUserName(), user.getPassword(),enabled , true, true, true,
                    AuthorityUtils.NO_AUTHORITIES);
            userDetails.add(_user);
        }
       return userDetails;
    }

    /**
     * Loads authorities by executing the SQL from <tt>authoritiesByUsernameQuery</tt>.
     *
     * @return a list of GrantedAuthority objects for the user
     */
    protected List<GrantedAuthority> loadUserAuthorities(String username) {
        List<TSysRole> roles=userMapper.loadUserRolesByUserName(username);
        List<GrantedAuthority> grantedAuthorities= new ArrayList<>();
        for(TSysRole role:roles){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleCode()));
        }
       return grantedAuthorities;
    }
}
