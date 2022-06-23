package com.dikkulah.isbasi.repository;


import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private static final List<User> userList =new ArrayList<>();

    public User save(User userRequest) {
        userList.add(userRequest);
        return userRequest;
    }

    public List<User> findAll() {
        return userList;
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public Optional<List<Commercial>> findCommercialsByUserEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).map(User::getCommercialList).findFirst();
    }
}
