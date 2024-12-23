package com.forgemycode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.forgemycode.beans.Vehicle;

@Configuration
public class ProjectConfig {
	
	
	@Bean
	public Vehicle vehicle() {
		
		Vehicle vehicle= new Vehicle();
		vehicle.setName("Audi");
		return vehicle;
	}

}
