package com.example.ProjectToPractice;

import com.example.ProjectToPractice.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectToPracticeApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(ProjectToPracticeApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

}
