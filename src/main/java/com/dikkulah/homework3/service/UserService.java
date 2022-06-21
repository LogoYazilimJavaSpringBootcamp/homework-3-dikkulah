package com.dikkulah.homework3.service;

import com.dikkulah.homework3.model.Customer;
import com.dikkulah.homework3.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User createUser(User userRequest);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    List<Customer> getCustomersUserByEmail(String email);
}
