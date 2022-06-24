package com.dikkulah.isbasi.model;
//Kasa

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Builder //KASA
public class Till {
    private Long id;
    private String name;
    private String currency;
    private Long openingBalance;
    private LocalDate openingBalanceDate;
    private Boolean isActive;

}
