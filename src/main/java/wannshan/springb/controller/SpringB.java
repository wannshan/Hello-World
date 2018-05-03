package wannshan.springb.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件功能：xxxx
 *
 */
@RestController
public class SpringB {


    @RequestMapping("/")
    String login(Model m) {
        return "login";
    }
    @RequestMapping("/register")
    String register(Model m) {
        return "register";
    }
    @RequestMapping("/index")
    String index() {
        //获取当前用户的授权信息
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            String username = ((UserDetails)principal).getUsername();
            //用户角色
            for(GrantedAuthority grantedAuthority:((UserDetails)principal).getAuthorities()){
                String roleCode=grantedAuthority.getAuthority();
            }
            //@TODO根据角色加载菜单
        } else {
            String username = principal.toString();
        }
        return "index";
    }

}
