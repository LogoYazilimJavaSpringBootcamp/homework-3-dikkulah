package com.dikkulah.isbasi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class BankAccount  {

    private String accountName; //para
    private Double openingBalance; //para
    private Double balance; // para
    private LocalDate openingBalanceDate; //para
    private String accountNo;
    private String currency;
    private String iban;
    private Boolean isActive;
    private Boolean isCreditCard;
}
