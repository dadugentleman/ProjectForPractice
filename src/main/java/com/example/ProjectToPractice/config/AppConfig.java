package com.example.ProjectToPractice.config;

import com.example.ProjectToPractice.controller.PizzaController;
import com.example.ProjectToPractice.service.NonVegPizza;
import com.example.ProjectToPractice.service.Pizza;
import com.example.ProjectToPractice.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }

}
