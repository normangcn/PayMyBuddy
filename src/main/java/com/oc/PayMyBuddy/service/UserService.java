package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.model.User;
import com.oc.PayMyBuddy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    public User getUserByID(int id) {
        userRepository.findById(id);
        return userRepository.findById(id).get();
    }
    public void addUser (User user) {
        userRepository.save(user);
    }
    public void updateUser(User user) {
        userRepository.save(user);
    }
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}