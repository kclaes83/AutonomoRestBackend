package be.claes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kristofclaes on 04/02/16.
 */
@RestController
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() throws Exception {
		return "Greetings from Spring Boot!";
	}

}
