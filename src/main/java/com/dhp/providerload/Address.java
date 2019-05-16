package com.dhp.providerload;

import com.opencsv.bean.CsvBindByName;

public class Address {
    @CsvBindByName(column = "ADDRESS LINE 1")
    private String addressLine1;
    @CsvBindByName(column = "ADDRESS LINE 2")
    private String addressLine2;

    @CsvBindByName(column = "CITY")
    private String city;
    @CsvBindByName(column = "STATE")
    private String state;
    @CsvBindByName(column = "ZIPCODE")
    private String zipCode;

}
