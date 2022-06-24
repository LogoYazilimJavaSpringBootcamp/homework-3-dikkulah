package com.dikkulah.isbasi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person { //müşteri tedarikçideki ilişkili kişiler alanı
    private String fullName;
    private String telNo;
    private String email;
}
