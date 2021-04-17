package com.cloudcomputing.servicioweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_account")
public class Usuarios {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="name",length = 255)
    private String name;
    private int location;

    public Usuarios(int id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public Usuarios() {
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
   



    
    
}
