package wannshan.springb.config;

//import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import wannshan.springb.service.support.CustomUserDetailsService;

/**
 * 文件功能：xxxx
 *
 */
@Configuration
public class MyApplicationConfig {

//    @Bean
//    public MyAuFilter  myAuFilter(){
//        return new MyAuFilter();
//    }
//    @Bean
//    public FilterRegistrationBean registration(MyAuFilter filter) {
//        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
////        registration.setEnabled(false);
////        registration.addUrlPatterns("/users/getUser/*");
//        return registration;
//    }


    @Bean
    public CustomUserDetailsService springDataUserDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
