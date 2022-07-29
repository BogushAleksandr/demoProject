package com.bogushsasha.demorest.service;

import com.bogushsasha.demorest.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> findAllUser();
    Optional<UserDto> findUser(Integer id);
    void deleteUser(Integer id);
}
