package com.oc.PayMyBuddy.DAO;

import java.util.List;
import java.util.Optional;

public interface UserDAO<User> {

    Optional<User> get(long id);

    List<User> getAll();

    void save(User user);

    void update(User user, String[] params);

    void delete(User user);
}
