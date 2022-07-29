package com.bogushsasha.demorest.service;

import com.bogushsasha.demorest.dao.Dao;
import com.bogushsasha.demorest.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIml implements UserService {
    private final Dao<UserDto> users;

    public UserServiceIml(Dao<UserDto> users) {
        this.users = users;
    }

    public List<UserDto> findAllUser() {
        return users.getAll();
    }

    public Optional<UserDto> findUser(Integer id) {
        return Optional.of(users.get(id).orElseThrow());
    }

    @Override
    public void deleteUser(Integer id) {
        users.delete(findUser(id).orElseThrow());
    }
}
