package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.DTOs.UserInDTO;
import com.oc.PayMyBuddy.model.User;
import com.oc.PayMyBuddy.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@PostMapping("/user/registration")
public ModelAndView RegisterUserAccount(@ModelAttribute("user") @Valid UserInDTO userDto,
                                        HttpServletRequest request, Errors errors) {


    try {
        User registered = userService.registerNewUserAccount(userDto);
    } catch (UserAlreadyExistException uaeEx) {
        mav.addObject("message", "An account for that username/email already exists.");
        return mav;
    }

    return new ModelAndView("successRegister", "user", userDto);
    // rest of the implementation
}