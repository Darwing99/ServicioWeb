package com.cloudcomputing.servicioweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idImage; 
     @Column(name = "idCarrera")
     private int idCarrera;
     @Column(name = "image")
     private byte[] image;

     
    public Image() {
    }
    public Image(int idImage, int idCarrera, byte[] image) {
        this.idImage = idImage;
        this.idCarrera = idCarrera;
        this.image = image;
    }
    public int getIdImage() {
        return idImage;
    }
    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
    public int getIdCarrera() {
        return idCarrera;
    }
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }

    
}
