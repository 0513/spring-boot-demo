package net.tobebetter.spring_boot.core.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * 写在前面的会先添加到filter责任链中
 */
//@Deprecated
@Configuration
public class ApplicationFilters {
	/**
	 * TODO 这里应该只是对返回modelAndView有用。对直接在浏览器输入无用
     */
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
////		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/WEB-INF/classes/templates");
//		viewResolver.setSuffix(".html");
//		return viewResolver;
//	}

}
