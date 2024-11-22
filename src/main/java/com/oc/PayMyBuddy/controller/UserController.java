package com.oc.PayMyBuddy.controller;

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
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseUser<User> getUserById(@PathVariable int id) {
        return service.getUserById(id)
                .map(ResponseUser::ok)
                .orElse(ResponseUser.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseUser<Void> deleteUser(@PathVariable int id) {
        service.deleteUser(id);
        return ResponseUser.noContent().build();
    }
}