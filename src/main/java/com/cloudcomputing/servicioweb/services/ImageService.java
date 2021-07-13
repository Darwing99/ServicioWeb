package com.cloudcomputing.servicioweb.services;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.IImage;
import com.cloudcomputing.servicioweb.model.Image;
import com.cloudcomputing.servicioweb.serviceinterfaces.IImagesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService implements IImagesService {
    @Autowired
    private IImage image;
    @Override
    public List<Image> listar() {
      
        return  (List<Image>)image.findAll();
    }

    @Override
    public Optional<Image> listar(int id) {
    
        return null;
    }

    @Override
    public void save(Image u) {
      image.save(u);
        
    }
   


    public Image GuardarImage(Image u){
        return image.save(u);

    }
    @Override
    public boolean delete(int id) {
        
        try {
            image.deleteById(id);
            return true;
           
       } catch (Exception e) {
          return false;
       }
    }
    
}
