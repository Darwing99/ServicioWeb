package com.cloudcomputing.servicioweb.controller;



import java.util.ArrayList;

import com.cloudcomputing.servicioweb.model.Image;
import com.cloudcomputing.servicioweb.services.ImageService;
import com.cloudcomputing.servicioweb.settings.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("image")
public class ControllerImage {
    @Autowired
    ImageService imageService;
    @GetMapping("/key="+constant.KEY+"/lista")
    public  ArrayList<Image> listar(){

        return imageService.listar();
    }

    @PostMapping("/key="+constant.KEY+"/insertlista")
    public Image guardarUsuarios(@RequestBody Image image){
        return this.imageService.GuardarImage(image);

    }

}
