package org.hello.oauth2.authorities.SpringSecurityOAuth2Authorities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringSecurityOAuth2AuthoritiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOAuth2AuthoritiesApplication.class, args);
	}


}
