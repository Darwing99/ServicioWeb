package com.cloudcomputing.servicioweb.controller;

import java.util.ArrayList;

import com.cloudcomputing.servicioweb.model.Usuarios;
import com.cloudcomputing.servicioweb.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class ControllerUsers {
    public static final String Key="2d3r5h8c1e3h2c1"; 
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/key="+Key+"/lista")
    public  ArrayList<Usuarios> listar(){

        return usuarioService.listar();
    }

    @PostMapping("/key="+Key+"/insertlista")
    public Usuarios guardarUsuarios(@RequestBody Usuarios users){
        return this.usuarioService.guardaUsuarios(users);

    }

}
