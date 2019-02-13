package com.dhp.providerload;


import com.opencsv.bean.CsvBindByName;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.UUID;

@Document(indexName = "smojum", type = "practiceLocations")
public class PracticeLocation implements Serializable {
    @Id
    private String id;
    @CsvBindByName(column = "GROUP NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @CsvBindByName(column = "ADDRESS LINE 1")
    private String addressLine1;
    @CsvBindByName(column = "ADDRESS LINE 2")
    private String addressLine2;

    @CsvBindByName(column = "CITY1")
    private String city;
    private String state;
    @CsvBindByName(column = "ZIPCODE")
    private String zipCode;
    public PracticeLocation() {

    }
    public PracticeLocation(String name, String addressLine1, String addressLine2, String city, String state, String zipCode) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
