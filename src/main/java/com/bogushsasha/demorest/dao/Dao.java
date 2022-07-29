package com.bogushsasha.demorest.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(Integer id);

    List<T> getAll();

    void delete(T t);
}
