package com.svk.springboot.springbootproject.controllers;

import com.svk.springboot.springbootproject.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("/v1")
public class RegistrationController {

    @PostMapping("/users")
    public UserDTO createUser(@Valid UserDTO userDTO){

        System.out.println("It is a valid userDTO.");

        return null;

    }


}
