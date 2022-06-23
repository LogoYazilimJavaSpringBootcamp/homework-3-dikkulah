package com.dikkulah.isbasi.model;

import com.dikkulah.isbasi.model.enums.CommercialType;
import com.dikkulah.isbasi.model.enums.FirmType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class Commercial {
    private FirmType firmType;
    private Long  id;
    private CommercialType commercialType;
    private String name; // bireysel
    private String surname; // bireysel
    private String title;
    private String shortTitle;
    private Long tcNo; // bireysel
    private String taxNo;
    private String taxAdministration;
    private Double openingBalance;
    private LocalDate openingBalanceDate;
    private String currency;
    private String category;
    private String explanation;
    private Boolean isActive;
    private Boolean isKDV; // eğer kapalı ise stopaj ve ek-vergi kapanmalı
    private Boolean isStoppage;
    private Boolean isAdditionalTax;
    private Contact contact;
    private List<Person> relatedPersons;
    private List<Address> otherAddresses;
    private List<BankAccount> bankAccounts;
    private List<Transaction> transactions;



}
