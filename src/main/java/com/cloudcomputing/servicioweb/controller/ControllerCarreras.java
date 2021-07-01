package com.cloudcomputing.servicioweb.controller;

import java.util.ArrayList;

import com.cloudcomputing.servicioweb.model.Carreras;
import com.cloudcomputing.servicioweb.services.CarreraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carreras/")
public class ControllerCarreras {
    public static final String Key="2d3r5h8c1e3h2c1"; 
    @Autowired
    CarreraService carreraService;
   
    @GetMapping("/key="+Key+"/lista")
    public  ArrayList<Carreras> listar(){

        return carreraService.listar();
    }

    @PostMapping("/key="+Key+"/insertlista")
    public Carreras guardarCarreras(@RequestBody Carreras carreras){
        return this.carreraService.guardarCarreras(carreras);

    }
}
