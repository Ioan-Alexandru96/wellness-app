package com.sda.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CaloriesController {

    @GetMapping("/calories")
    public String getCaloriesPage() {
        return "calculator/calories";
    }
}
