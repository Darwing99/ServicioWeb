package com.cloudcomputing.servicioweb.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Usuarios;
import com.cloudcomputing.servicioweb.services.UsuarioService;
import com.cloudcomputing.servicioweb.settings.constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


 
@RestController
@RequestMapping("/user")
public class ControllerUsers {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/key="+constant.KEY+"/lista")
    public  ArrayList<Usuarios> listar(){
        return usuarioService.listar();
    }
    @PostMapping("/key="+constant.KEY+"/insertlista")
    public Usuarios guardarUsuarios(@RequestBody Usuarios users){
        return this.usuarioService.guardaUsuarios(users);
    }

    @PutMapping("/key="+constant.KEY+"/update/{id}")
    public Optional<Usuarios> UpdateUsuarios(@RequestBody Usuarios usuarios,int id) {
     
        return usuarioService.findById(id).map(data->{
          usuarios.setName(data.getName());
          usuarios.setCorreo(data.getCorreo());
          usuarios.setDireccion(data.getDireccion());
          usuarios.setImage(data.getImage());
          usuarios.setFecha(data.getFecha());
          usuarios.setPassword(data.getPassword());
          return usuarioService.listar(id);

        }).orElseGet(()->{
          usuarios.setId(id);
          return usuarioService.listar(id);
        });
    }


    @DeleteMapping(value="/key="+constant.KEY+"/lista/{id}")
    public void DeleteMapping(@PathVariable int id){
        usuarioService.delete(id);
      }

}
