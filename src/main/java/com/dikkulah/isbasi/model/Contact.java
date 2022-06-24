package com.dikkulah.isbasi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Contact { //müşteri tedarikçideki iletişim alanı
    private String addressTitle;
    private String country;
    private String provide;
    private String district;
    private Integer postCode;
    private String email;
    private String faxNo;
    private List<String> phones;
    private String website;



}
