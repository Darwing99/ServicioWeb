package com.cloudcomputing.servicioweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="UserList")
public class Usuarios {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="name",length = 255)
    private String name;
    @Column(name="correo",length = 255)
    private String correo;
    @Column(name="fecha",length = 255)
    private Date  fecha;
    private byte[] image;
    private String direccion;
    private String password;
    private boolean estado;

  
    public Usuarios(int id, String name,String correo,Date fecha,byte[] image,String direccion, String password,boolean estado) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.fecha=fecha;
        this.image=image;
        this.direccion=direccion;
        this.password=password;
        this.estado=estado;
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
    public String getCorreo() {
        return correo;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPassword() {
        return (password);
    }
   
    public void setPassword(String password) {
        this.password = (password);
    }
   

    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}
