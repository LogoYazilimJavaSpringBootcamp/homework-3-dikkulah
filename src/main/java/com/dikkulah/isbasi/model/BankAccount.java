package com.dikkulah.isbasi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class BankAccount {
    private String bankName;
    private String branchName;
    private String branchCode;
    private String authorizedPerson; //para
    private String telNo;  //para
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
