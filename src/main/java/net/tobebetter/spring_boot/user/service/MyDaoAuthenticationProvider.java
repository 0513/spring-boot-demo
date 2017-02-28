package net.tobebetter.spring_boot.user.service;

import net.tobebetter.spring_boot.user.model.User;
import net.tobebetter.spring_boot.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 0513 on 2017/2/28.
 */
@Service
public class MyDaoAuthenticationProvider extends DaoAuthenticationProvider {
    @Autowired
    private UserRepository userRepository;
    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        this.setPasswordEncoder(new ShaPasswordEncoder());
        //通过try-catch可添加自己的登录成功/失败处理代码 AuthenticationException
        super.additionalAuthenticationChecks(userDetails, authentication);
    }

    @Override
    @Resource(name = "userDetailsServiceImpl")
    public void setUserDetailsService(UserDetailsService userDetailsService) {
        super.setUserDetailsService(userDetailsService);
    }

}
