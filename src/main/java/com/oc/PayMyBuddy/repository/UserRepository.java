package com.oc.PayMyBuddy.repository;

import com.oc.PayMyBuddy.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer> {

}
