package com.sheryians.major.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
        // Check if the entered email and password match the admin credentials
        if (email.equals("admin@gmail.com") && password.equals("admin12345")) {
            // If matched, redirect to adminHome.html
            return "redirect:/adminHome.html";
        } else {
            // If not matched, redirect to shop.html
            return "redirect:/shop.html";
        }
    }
}
