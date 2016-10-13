package net.tobebetter.spring_boot.core.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 写在前面的会先添加到filter责任链中
 */
@Configuration
public class ApplicationFilters {
	// @Bean
	// public RemoteIpFilter remoteIpFilter() {
	// return new RemoteIpFilter();
	// }
	// @Bean
	// public RemoteHostFilter remoteHostFilter() {
	// return new RemoteHostFilter();
	// }
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/").allowedOrigins("*");
			}
		};
	}
}
