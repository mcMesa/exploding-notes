package com.github.mcmesa.explodingnotes.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RoutingController {

    @RequestMapping("/")
    public String getGreeting(){
        return "Cheers, you successfully started your application!";
    }

}
