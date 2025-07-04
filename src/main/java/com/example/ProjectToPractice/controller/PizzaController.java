package com.example.ProjectToPractice.controller;

import com.example.ProjectToPractice.service.Pizza;
import com.example.ProjectToPractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pizzaDemo")
public class PizzaController {


    private Pizza pizza;

    @Autowired
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
}
