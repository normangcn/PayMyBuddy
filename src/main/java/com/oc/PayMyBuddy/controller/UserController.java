package com.oc.PayMyBuddy.controller;

import com.oc.PayMyBuddy.model.User;
import com.oc.PayMyBuddy.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }



    @PostMapping
    public User createEntity(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return service.getUserByID(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
       service.deleteUser(id);
    }
}