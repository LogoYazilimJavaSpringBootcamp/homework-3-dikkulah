package com.dikkulah.isbasi.model;

import com.dikkulah.isbasi.model.enums.AdditionalTaxType;
import com.dikkulah.isbasi.model.enums.ProductType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
//Hizmetler
@Builder
@Getter
@Setter
public class Product {
    private ProductType productType;
    private Long id;
    private String name;
    private String unit; //birim gün ay kg vs.
    private Double kdvRate;
    private String currency;
    private Double unitBuyPriceWithKdv;
    private Double unitBuyPriceWithOutKdv;
    private Double unitSellPriceWithKdv;
    private Double unitSellPriceWithOutKdv;
    private String stoppage;
    private Double stoppageRate;
    private Boolean isAdditionalTax;
    private AdditionalTaxType additionalTaxType;
    private Double additionalTax;
    private String barcode; //merch
    private String secondaryName; //merch
    private String brand; //merch
    private String serviceGroup; // service
    private String category;
    private Boolean isActive;


}
