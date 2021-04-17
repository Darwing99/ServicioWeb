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
    @Column(name="direccion",length = 255)
    private String direccion;
    public Location() {

    }
    public Location(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
