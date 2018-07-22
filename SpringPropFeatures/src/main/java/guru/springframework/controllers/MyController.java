package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.PrimaryGermanGreetingService;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
    	
    	if (greetingService instanceof PrimaryGermanGreetingService )
    	{
    		System.out.println("inside german");
    	}
    		
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
