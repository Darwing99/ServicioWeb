package com.cloudcomputing.servicioweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="location",length = 255)
    private String location;
    public Location() {
    }
    public Location(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    
    
}
