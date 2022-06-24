package com.dikkulah.isbasi.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Builder
public class Till {//KASA
    private Long id;
    private String name;
    private String currency;
    private Long openingBalance;
    private LocalDate openingBalanceDate;
    private Boolean isActive;

}
