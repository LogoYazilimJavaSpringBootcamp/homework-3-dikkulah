package com.dikkulah.isbasi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class Cheque { //ÇEK
    private Long id;
    private Commercial commercial;
    private LocalDate transactionDate;
    private LocalDate chequeDate;
    private List<Invoice> relatedInvoices;


}
