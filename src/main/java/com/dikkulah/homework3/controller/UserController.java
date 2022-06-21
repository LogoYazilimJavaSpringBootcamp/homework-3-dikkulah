package com.dikkulah.homework3.controller;

import com.dikkulah.homework3.model.Customer;
import com.dikkulah.homework3.model.User;
import com.dikkulah.homework3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
    @GetMapping(value = "/{email}/customers")
    public List<Customer> getCustomersUserByEmail(@PathVariable String email) {
        return userService.getCustomersUserByEmail(email);
    }

}
