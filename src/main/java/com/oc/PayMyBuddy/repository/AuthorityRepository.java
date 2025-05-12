package com.oc.PayMyBuddy.repository;

import com.oc.PayMyBuddy.model.Authority;
import com.oc.PayMyBuddy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
    Authority findByName(String authority);
}
