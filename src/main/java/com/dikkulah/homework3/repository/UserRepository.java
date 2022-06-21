package com.dikkulah.homework3.repository;

import com.dikkulah.homework3.model.Customer;
import com.dikkulah.homework3.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private static List<User> userList =new ArrayList<>();

    public User save(User userRequest) {
        /*userRequest.getCustomerList().add(new Customer("Ali"));
        userRequest.getCustomerList().add(new Customer("Onur"));

        userRequest.getCustomerList().add(new Customer("Enes"));*/

        userList.add(userRequest);
        return userRequest;
    }

    public List<User> findAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public Optional<List<Customer>> findCustomersByUserEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).map(User::getCustomerList).findFirst();
    }
}
