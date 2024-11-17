package com.project.bank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service {

    @Id
    private String name;
    private String description;

    public Service() {}

    public Service(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
