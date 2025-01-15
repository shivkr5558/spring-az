package spring.az;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class HomeController {
	
	@GetMapping("/home")
	public String getMessage() {
		
		return "Azure devops project";
	}
}
