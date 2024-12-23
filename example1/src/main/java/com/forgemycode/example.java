package com.forgemycode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.forgemycode.beans.Vehicle;
import com.forgemycode.config.ProjectConfig;

public class example {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("volksvagan");

		// ApplicationContext context= new
		// AnnotationConfigApplicationContext(ProjectConfig.class);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle v = context.getBean(Vehicle.class);
		System.out.println(v);
		

	}
}
