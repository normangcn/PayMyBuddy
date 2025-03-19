package com.oc.PayMyBuddy.controller;

import com.oc.PayMyBuddy.DTOs.UserInDTO;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class WebPageController implements WebMvcConfigurer {

        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/home").setViewName("home");
            registry.addViewController("/").setViewName("home");
            registry.addViewController("/hello").setViewName("hello");
            registry.addViewController("/login").setViewName("login");
        }
        @GetMapping("/user/registration")
        public String showRegistrationForm(WebRequest request, Model model) {
            UserInDTO userInDto = new UserInDTO();
            model.addAttribute("user", userInDto);
            return "registration";
        }

    }

