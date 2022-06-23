package com.dikkulah.isbasi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankAccount {
    private String bankName;
    private String branchName;
    private String branchCode;
    private String accountNo;
    private String currency;
    private String iban;
}
