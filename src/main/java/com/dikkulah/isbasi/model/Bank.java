package com.dikkulah.isbasi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Bank {
    // MÜŞTERİ TEDARİKÇİ VE PARA SEKMESİNDEKİ BANKA BİLGİLERİNİ ORTAK BİR MODELE İNDİRGEYEMEDİM
    private String id;
    private String bankName;
    private String branchName;
    private String branchCode;
    private String authorizedPerson; //para
    private String telNo;  //para
    private List<BankAccount> bankAccountList;
}
