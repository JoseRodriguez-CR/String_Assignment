package com.joserodriguez;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // This annotation allows us to use the file as our Controller
public class StringAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringAssignmentApplication.class, args);
	}
	
	@RequestMapping( "/" )
	public String message() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping( "/random" )
	public String randomMessage() {
		Random randomNumber = new Random();
		String messageOption = "";
		int randomOption;
		randomOption = randomNumber.nextInt(3);  
		System.out.println(messageOption);
		if( randomOption == 0 ) {
			messageOption = "pretty easy to respond with strings.";
		}else if( randomOption == 1 ) {
			messageOption = "answering with this string.";
			}else if( randomOption == 2 ) {
				messageOption = "using a random method to choose one of the messages.";
			}else {
				messageOption = "Would you like to learn about Spring Boot?";
			}
		
		
		return "Is amazing that you are using Spring Boot, " + messageOption; 
	}
	

}
