package com.jgotechmaker.debut.entities;

public class Product {
    private String reference;
    private String designation;
    private Integer quantity ;
    private Integer price ;

    public Product() {
    }

    public Product(String reference, String designation, Integer quantity, Integer price) {
        this.reference = reference;
        this.designation = designation;
        this.quantity = quantity;
        this.price = price;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "reference='" + reference + '\'' +
                ", designation='" + designation + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
