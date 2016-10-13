package net.tobebetter.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication //@ComponentScan、@Configuration @EnableAutoConfiguration
public class Application {

	/**
	 * DONE：spring data/mysql/filter/festful/cors/test(rest-assured)
	 * TODO：spring security/log4j(logback)/jrebel/web socket/git
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}