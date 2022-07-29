package com.bogushsasha.demorest.dao;

import com.bogushsasha.demorest.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserDao implements Dao<UserDto> {
    private List<UserDto> userDtos = new ArrayList<>();

    public UserDao() {
        userDtos.add(new UserDto(1, "John", "Red", "BMW", "New York, Street Left"));
        userDtos.add(new UserDto(2, "Bob", "Black", "Audi", "London, Street empty"));
        userDtos.add(new UserDto(3, "Anna", "Green", "Honda", "Paris, Street Right"));
    }

    public Optional<UserDto> get(Integer id) {
        var matchingUser = userDtos.stream().filter(p -> p.getId().equals(id)).findFirst();
        return Optional.of(matchingUser.orElseThrow());
    }

    public List<UserDto> getAll() {
        return userDtos;
    }

    public void delete(UserDto user) {
        userDtos.remove(user);
    }
}
