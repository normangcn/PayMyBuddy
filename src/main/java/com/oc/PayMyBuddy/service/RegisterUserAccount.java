package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.dto.UserInDTO;
import com.oc.PayMyBuddy.exception.UserAlreadyExistException;
import com.oc.PayMyBuddy.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class RegisterUserAccount {
    private final UserService userService;

    public RegisterUserAccount(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/registration")
    public ModelAndView RegisterUserAccount(@ModelAttribute("user") @Valid UserInDTO userDto, HttpServletRequest request, Errors errors, ModelAndView mav) {

        try {
            User registered = userService.registerNewUserAccount(userDto);
            mav.addObject("user", registered);
        } catch (UserAlreadyExistException uaeEx) {
            mav.addObject("message", "An account for that username/email already exists.");
            return mav;
        }

        return  mav;
        // rest of the implementation
    }
}