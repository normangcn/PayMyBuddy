package com.oc.PayMyBuddy.controller;

import com.oc.PayMyBuddy.model.User;
import com.oc.PayMyBuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }

    @PostMapping
    public User createEntity(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseUser<User> getUserById(@PathVariable int id) {
        return service.getUserById(id)
                .map(ResponseUser::ok)
                .orElse(ResponseUser.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseUser<User> deleteUser(@PathVariable int id) {
        service.deleteUser(id);
        return ResponseUser.noContent().build();
    }
}