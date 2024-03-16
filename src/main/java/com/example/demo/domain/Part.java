package com.example.demo.domain;

import com.example.demo.validators.ValidDeletePart;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Entity
@ValidDeletePart
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name="Parts")
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @Min(value = 0, message = "Price value must be positive")
    double price;
    @Min(value = 0, message = "Inventory value must be positive")
    int inv;

    @Min(value = 0, message = "Minimum inventory value cannot be below zero")
    private Integer minInventory;

    @Max(value = 100, message= "Inventory can hold a maximum of 100 items")
    private Integer maxInventory;

    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();

    public Part() {
    }

    public Part(String name, double price, int inv, Integer minInventory, Integer maxInventory) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInventory = minInventory;
        this.maxInventory = maxInventory;
    }

    public Part(long id, String name, double price, int inv, Integer minInventory, Integer maxInventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInventory = minInventory != null ? minInventory : 0;
        this.maxInventory = maxInventory != null ? maxInventory : 100;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public void setMinInventory(Integer minInventory) {
        this.minInventory = minInventory;
    }

    public void setMaxInventory(Integer maxInventory) {
        this.maxInventory = maxInventory;
    }

    public boolean isInventoryValid() {
        return inv >= minInventory && inv <= maxInventory;
    }

    public int getMinInventory() {
        return minInventory != null ? minInventory : 0;
    }

    public int getMaxInventory() {
        return maxInventory != null ? maxInventory : 100;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
