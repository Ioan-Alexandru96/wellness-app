package com.sda.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeightController {

    @GetMapping("/idealweight")
    public String getIdealWeightPage() {return "calculator/idealweight"; }
}
