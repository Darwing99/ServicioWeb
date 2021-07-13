package com.cloudcomputing.servicioweb.controller;

import java.util.List;

import com.cloudcomputing.servicioweb.model.Image;
import com.cloudcomputing.servicioweb.services.ImageService;
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
@RequestMapping("/image")
public class ControllerImage {
    @Autowired
    ImageService imageService;

 @GetMapping("/key="+constant.KEY+"/lista")
    public  List<Image> listar(){

        return imageService.listar();
    }

    @PostMapping("/key="+constant.KEY+"/insertlista")
    public Image guardarCarreras(@RequestBody Image img){
        return this.imageService.GuardarFriends(img);

    }


    @DeleteMapping(value="/key="+constant.KEY+"/lista/{id}")
    public void DeleteMapping(@PathVariable int id){
        imageService.delete(id);
      }

}
