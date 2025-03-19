package com.oc.PayMyBuddy.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
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
            UserInDto userInDto = new UserInDto();
            model.addAttribute("user", userInDto);
            return "registration";
        }

    }

