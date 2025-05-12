package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.dto.UserInDTO;
import com.oc.PayMyBuddy.exception.UserAlreadyExistException;
import com.oc.PayMyBuddy.model.Authority;
import com.oc.PayMyBuddy.model.User;
import com.oc.PayMyBuddy.repository.AuthorityRepository;
import com.oc.PayMyBuddy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class UserService implements IUserService {

    private final AuthorityRepository authorityRepository;
    private final UserRepository userRepository;

    public UserService(AuthorityRepository authorityRepository, UserRepository userRepository) {
        this.authorityRepository = authorityRepository;
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUserByID(int id) {
        userRepository.findById(id);
        return userRepository.findById(id).get();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User registerNewUserAccount(UserInDTO userDto) throws UserAlreadyExistException {
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + userDto.getEmail());
        }
        Set<Authority> authorities = new HashSet<>();
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setAuthorities(authorities);

        return userRepository.save(user);
    }

private boolean emailExists(String email) {
    return userRepository.findByEmail(email) != null;
}
 }
