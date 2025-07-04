package com.example.ProjectToPractice.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class VegPizza implements Pizza {


    @Override
    public String getPizza(){
        return "Veg Pizza!";
    }
}
