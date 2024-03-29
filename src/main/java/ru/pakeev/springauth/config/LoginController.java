package ru.pakeev.springauth.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    // открывает кастомную страницу регистрации login.html
    @GetMapping("/auth/api/v1/login")
    public String login(){
        return "login";
    }
}
