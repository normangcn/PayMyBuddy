package com.oc.PayMyBuddy.DAO;

public interface DAO<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}
