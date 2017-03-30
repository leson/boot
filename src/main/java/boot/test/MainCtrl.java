package boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainCtrl {

	@RequestMapping("/")
	String test() {

		return "hello spring boot world";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainCtrl.class, args);
	}

}
