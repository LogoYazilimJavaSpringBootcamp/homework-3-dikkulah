package com.dikkulah.isbasi.service;
import com.dikkulah.isbasi.model.Customer;
import com.dikkulah.isbasi.model.User;
import com.dikkulah.isbasi.repository.UserRepository;
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
        return userRepository.findByEmail(email).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Customer> getCustomersByUserEmail(String email) {
        return userRepository.findCustomersByUserEmail(email).orElseThrow(RuntimeException::new);
    }
}
