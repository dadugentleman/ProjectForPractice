package com.example.ProjectToPractice;

import com.example.ProjectToPractice.list.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pornire {

    @GetMapping("/man")
    public String info(Model model){
        People people = new People("asd", "sads", 20);
        model.addAttribute("people",people);
        return people.getLastName() + people.getName() + people.getAge();
    }

    @GetMapping("/infoaboutme")
    public String myinfo(Model model){
        People people = new People("Alexandru", "Guzun", 23);
        model.addAttribute("people", people);
        return people.getLastName() + " " + people.getName() + " " + people.getAge();
    }
}
