package com.dikkulah.isbasi.service;



import com.dikkulah.isbasi.model.Customer;
import com.dikkulah.isbasi.model.User;

import java.util.List;


public interface UserService {
    User createUser(User userRequest);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    List<Customer> getCustomersByUserEmail(String email);
}
