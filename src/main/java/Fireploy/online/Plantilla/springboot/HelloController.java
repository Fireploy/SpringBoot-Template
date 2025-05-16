package Fireploy.online.Plantilla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

    @GetMapping("/")
	public String welcome() {
		return "Welcome to Fireploy!";
	}

}