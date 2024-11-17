package com.project.bank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Branch {

    @Id
    private String name;
    private String address;

    
    public Branch() {}

    
    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
