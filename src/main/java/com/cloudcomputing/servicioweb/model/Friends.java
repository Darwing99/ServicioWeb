package com.cloudcomputing.servicioweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "friendsList")
public class Friends {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="idfriends")
    private String idfriends;
    @Column(name = "estado")
    private boolean estado;
    public Friends() {
    }

    public Friends(int id, String idfriends, boolean estado) {
        this.id = id;
        this.idfriends = idfriends;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdfriends() {
        return idfriends;
    }

    public void setIdfriends(String idfriends) {
        this.idfriends = idfriends;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

 



}
