package net.tobebetter.spring_boot.core.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * WebMvcConfigurerAdapter可实现功能：
 * 1. 增加拦截器
 * 2.
 */
@Configuration
//@EnableWebMvc  此注解加上之后，所以spring mvc默认配置失效
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("*")
			.allowCredentials(false).maxAge(3600);
	}

	/***
	 * 静态资源访问路径
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/");
	}

	/**
	 * 增加拦截器
	 * 功能同xml中： <mvc:interceptors>
     */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/secure/*");
	}

	/**
	 * 配置i18n文件名
	 * @return
     */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	/**
	 * 转发请求到视图
	 * 功能同xml:<mvc:view-controller path="/" view-name="index"/>
	 * 与net.tobebetter.spring_boot.core.filter.ApplicationFilters#viewResolver()共同工作
     */
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("/pages/index");
//		registry.addViewController("/user/center").setViewName("/pages/user/center");
//		registry.addViewController("/login").setViewName("/templates/login");
////		registry.addViewController("/index").setViewName("index");
//	}

}