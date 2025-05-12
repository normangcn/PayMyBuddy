package com.oc.PayMyBuddy.repository;

import com.oc.PayMyBuddy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
