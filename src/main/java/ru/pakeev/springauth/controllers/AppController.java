package ru.pakeev.springauth.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.pakeev.springauth.models.MyUser;
import ru.pakeev.springauth.services.AppService;

@RestController
@RequestMapping("auth/api/v1")
@AllArgsConstructor
@EnableWebSecurity
public class AppController {
    private AppService service;

//    @GetMapping("/login")
//    @PostMapping("/login")
//    public ModelAndView login(){
//        return new ModelAndView("index");
//    }

//    @PostMapping("/login")
//    public ModelAndView newLogin(){
//        return new ModelAndView("login");
//    }


//    @PostMapping("/verify")

    @PostMapping("/auth/api/v1/new-user")
    public String addUser(@RequestBody MyUser user){
        service.addUser(user);
        return "User is saved";
    }
}


