package com.dikkulah.isbasi.model;

import com.dikkulah.isbasi.model.enums.FirmType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private FirmType firmType;
    private Address address;
    private List<Customer> customerList;
}
