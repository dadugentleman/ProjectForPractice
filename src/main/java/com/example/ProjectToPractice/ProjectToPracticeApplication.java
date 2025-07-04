package com.example.ProjectToPractice;

import com.example.ProjectToPractice.controller.PizzaController;
import com.example.ProjectToPractice.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectToPracticeApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(ProjectToPracticeApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());

//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");
//		System.out.println(vegPizza.getPizza());
	}

}
