package com.svk.springboot.springbootproject.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsAvailableController {

    @GetMapping(value = "isAvailable")
    public String isAvailable(){

        return "The service is available.";

    }



}
