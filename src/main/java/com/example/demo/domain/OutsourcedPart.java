package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part {
    String companyName;

    public OutsourcedPart() {

    }
    public OutsourcedPart(String name, double price, int inv, Integer minInventory, Integer maxInventory) {
        // Call the constructor of the superclass (Part) with relevant parameters
        super(name, price, inv, minInventory, maxInventory);
    }


    // Getters and setters for companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}