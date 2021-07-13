package com.cloudcomputing.servicioweb.services;

import java.util.ArrayList;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.ICarreras;
import com.cloudcomputing.servicioweb.model.Carreras;
import com.cloudcomputing.servicioweb.serviceinterfaces.ICarrerasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService implements ICarrerasService  {

    @Autowired
    private ICarreras dataCarreras;
    @Override
    public ArrayList<Carreras> listar() {
     
        return  (ArrayList<Carreras>)dataCarreras.findAll();
    }

    @Override
    public Optional<Carreras> listar(int id){
      
        return dataCarreras.findById(id);
    }


    //actualiza y guarda
    @Override
    public void save(Carreras u) {
        dataCarreras.save(u);
    }


    public Carreras guardarCarreras(Carreras carreras){
       
        return dataCarreras.save(carreras);

    }
    @Override
    public boolean delete(int id){
        try {
             dataCarreras.deleteById(id);
             return true;
            
        } catch (Exception e) {
           return false;
        }

    }
    
    
}
