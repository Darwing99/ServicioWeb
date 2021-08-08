package com.cloudcomputing.servicioweb.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="CarreraList")
public class Carreras {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idToken;
@Column(name="carrera",length = 200)
private String carrera;
@Column(name="IdUser",length = 100)
private int IdUser;
@Column(name="fecha")
private Date fecha;
@Column(name="distancia",length = 100)
private double distancia;
@Column(name = "fotos")
private byte[] fotos;
@Column(name="tiempo",length = 1)
private double tiempo;
@Column(name="estado",length = 1,scale = 1)
private boolean estado;
    
public Carreras(int idToken, String carrera, int idUser, Date fecha, double distancia, byte[] fotos,
        double tiempo, boolean estado) {
        this.idToken = idToken;
        this.carrera = carrera;
        this.IdUser = idUser;
        this.fecha = fecha;
        this.distancia = distancia;
        this.fotos = fotos;
        this.tiempo = tiempo;
        this.estado = estado;
}

public Carreras() {
}

public int getIdToken() {
    return idToken;
}
public void setIdToken(int idToken) {
    this.idToken = idToken;
}
public String getCarrera() {
    return carrera;
}
public void setCarrera(String carrera) {
    this.carrera = carrera;
}
public int getIdUser() {
    return IdUser;
}
public void setIdUser(int idUser) {
    IdUser = idUser;
}
public Date getFecha() {
    return fecha;
}
public void setFecha(Date fecha) {
    this.fecha = fecha;
}
public double getDistancia() {
    return distancia;
}
public void setDistancia(double distancia) {
    this.distancia = distancia;
}

public double getTiempo() {
    return tiempo;
}
public void setTiempo(double tiempo) {
    this.tiempo = tiempo;
}
public boolean isEstado() {
    return estado;
}
public void setEstado(boolean estado) {
    this.estado = estado;
}

public byte[] getFotos() {
    return fotos;
}

public void setFotos(byte[] fotos) {
    this.fotos = fotos;
}

}
