package com.example.ProjectToPractice.controller;

import com.example.ProjectToPractice.service.Pizza;
import com.example.ProjectToPractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {


    private Pizza pizza;

    //@Autowired
    public PizzaController(Pizza pizza){
        this.pizza = pizza;

    }

//    @Autowired
//    public void setPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Initailzation logic");
    }

    public void destroy(){
        System.out.println("Destruction logic");
    }
}
