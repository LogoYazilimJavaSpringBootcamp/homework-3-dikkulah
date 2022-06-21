package com.dikkulah.homework3.service;

import com.dikkulah.homework3.model.Customer;
import com.dikkulah.homework3.model.User;
import com.dikkulah.homework3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User userRequest) {
        return userRepository.save(userRequest);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public List<Customer> getCustomersUserByEmail(String email) {
        return userRepository.findCustomersByUserEmail(email).orElseThrow();
    }
}
