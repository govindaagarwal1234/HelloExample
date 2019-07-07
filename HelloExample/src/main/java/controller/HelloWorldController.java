package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TemperatureService;

@RestController
@RequestMapping("/welcome")
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String getHelloWorld() {
		return "Hello World !";
	}
	@RequestMapping("/tokelvin/{id}")
	public String toKelvin(@PathVariable("id") String id) {
		return TemperatureService.temperatureService(id);
	}
	@RequestMapping("/tempconv/{id}")
	public String tempconv(@PathVariable("id") String id) {
		
		Integer temp=Integer.parseInt(id);
		temp=(temp+273);
		
		return temp.toString();
	}
}
