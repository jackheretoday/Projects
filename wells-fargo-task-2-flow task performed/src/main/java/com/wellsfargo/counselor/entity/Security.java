package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    private long purchase_price;
     private long quantity;
     
    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchase_date;

    protected Security() {

    }

    public Security(String category, String purchase_date) {
        this.category = category;
        this.purchase_date = purchase_date;
       
    }

    public Long getSecurityId() {
        return securityId;
    }
    
     public Long getpurchase_price() {
        return purchase_price;
    }

  public Long getquantity() {
        return quantity;
    }
    
    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpurchase_date() {
        return purchase_date;
    }

    public void setpurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }
    
}
