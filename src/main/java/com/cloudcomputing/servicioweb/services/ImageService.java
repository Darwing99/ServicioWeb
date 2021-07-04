package com.cloudcomputing.servicioweb.services;

import java.util.ArrayList;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.IImages;
import com.cloudcomputing.servicioweb.model.Image;
import com.cloudcomputing.servicioweb.serviceinterfaces.IImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService implements IImageService {

    @Autowired
    private IImages images;

    
    @Override
    public ArrayList<Image>listar() {
       
        return (ArrayList<Image>)images.findAll();
    }
   
    @Override
    public Optional<Image> listar(int id) {
       
        return images.findById(id);
    }

    @Override
    public void save(Image u) {
        images.save(u);
        
    }

    public Image GuardarImage(Image image){
        return images.save(image);

    }
    @Override
    public boolean delete(int id) {
        try {
            images.deleteById(id);
            return true;
           
       } catch (Exception e) {
          return false;
       }

        
    }
    
    
}
