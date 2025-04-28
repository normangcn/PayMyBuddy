package com.oc.PayMyBuddy.controller;

import com.oc.PayMyBuddy.dto.UserInDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
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
        public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserInDTO userInDTO,
                                                HttpServletRequest request, Errors errors)
        {
            ModelAndView modelAndView = new ModelAndView("view/viewRegistrationPage");
            modelAndView.addObject("testMessage", "TestMessage");
            return modelAndView; //TODO Test function and implement correct return and Object
        }

    }

