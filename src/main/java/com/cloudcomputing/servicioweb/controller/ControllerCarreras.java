package com.cloudcomputing.servicioweb.controller;

import java.util.ArrayList;

import com.cloudcomputing.servicioweb.model.Carreras;
import com.cloudcomputing.servicioweb.services.CarreraService;
import com.cloudcomputing.servicioweb.settings.constant;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carreras")
public class ControllerCarreras {
   
    @Autowired
    private CarreraService carreraService;
   
    
    @GetMapping("/key="+constant.KEY+"/lista")
    public  ArrayList<Carreras> listar(){

        return carreraService.listar();
    }

    @PostMapping("/key="+constant.KEY+"/insertlista")
    public Carreras guardarCarreras(@RequestBody Carreras carreras){
        return this.carreraService.guardarCarreras(carreras);

    }
    @DeleteMapping("/key="+constant.KEY+"/lista/{id}")  
    public void DeleteMapping(@PathVariable int id){
      carreraService.delete(id);
    }
    

}
