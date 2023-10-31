package com.InterviewTracker.Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@CrossOrigin(origins="*")
public class TrackerApplication {
	
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
	
}
