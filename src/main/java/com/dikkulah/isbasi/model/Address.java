package com.dikkulah.isbasi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Address {
    private String addressTitle;
    private String fullName;
    private List<String> phones;
    private String detail;
    private String country;
    private String provide;
    private String district;

}
