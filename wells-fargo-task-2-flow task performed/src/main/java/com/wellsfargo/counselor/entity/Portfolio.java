package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String create_date;

    protected Portfolio() {

    }

    public Portfolio(String create_date) {
        this.create_date = create_date;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public String getDate() {
        return create_date;
    }

    public void setDate(String create_date) {
        this.createdate = create_date;
    }
    
}
