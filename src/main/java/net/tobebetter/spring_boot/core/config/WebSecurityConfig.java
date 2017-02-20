package net.tobebetter.spring_boot.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by zhang on 2017/2/20.
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").authenticated()  //  个人中心必须身份验证
                .anyRequest().permitAll()   //所有的路径都必须无需身份验证
                .and().formLogin().loginPage("/login") //定义当需要用户登录时候，转到的登录页面
                    .failureForwardUrl("/login?error").successForwardUrl("/").permitAll()
                .and().logout().permitAll();
        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("123abc").roles("USER"); //测试用用户名及密码
    }
}