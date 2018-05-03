package wannshan.springb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import wannshan.springb.service.support.CustomUserDetailsService;

/**
 * 文件功能：xxxx
 *
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
   private  CustomUserDetailsService customUserDetailsService;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/css/**", "/javascript/**","/img/**").permitAll()
//                .antMatchers("/users/**").authenticated()
//                .antMatchers("/index").authenticated()
//                .antMatchers("/register").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login").permitAll().defaultSuccessUrl("/index").failureUrl("/");
//        http    .logout()
//                .logoutUrl("/logout").permitAll()
//                .logoutSuccessUrl("/");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }


}
