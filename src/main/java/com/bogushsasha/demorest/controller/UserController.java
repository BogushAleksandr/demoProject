package com.bogushsasha.demorest.controller;

import com.bogushsasha.demorest.dto.UserDto;
import com.bogushsasha.demorest.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Optional<UserDto> findUser(@PathVariable final Integer id) {
        return userService.findUser(id);
    }

    @GetMapping()
    public List<UserDto> findAllUsers() {
        return userService.findAllUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable final Integer id) {
       userService.deleteUser(id);
    }
}
