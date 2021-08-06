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
    @Column(name="idToken",length = 255)
    private String idToken;
    @Column(name="correo",length = 255)
    private String correo;
    @Column(name="pais",length = 255)
    private String pais;
    @Column(name="fecha",length = 255)
    private Date fecha;
    @Column(name="image",length = 255)
    private byte[] image;
    @Column(name="direccion",length = 255)
    private String direccion;
    @Column(name="password",length = 255)
    private String password;
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Column(name="estado",length = 255)
    private boolean estado;

  
    public Usuarios(int id,String idToken,  String name,String correo,String pais, Date fecha,byte[] image,String direccion, String password,boolean estado) {
        this.id = id;
        this.idToken=idToken;

        this.name = name;
        this.correo = correo;
        this.pais=pais;
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

    public String getIdToken() {
        return idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

   


}
