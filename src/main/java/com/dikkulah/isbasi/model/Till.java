package com.dikkulah.isbasi.model;
//Kasa

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Builder
public class Till {
    private String name;
    private String currency;
    private Long openingBalance;
    private LocalDate openingBalanceDate;

}
