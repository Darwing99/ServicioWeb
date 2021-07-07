package com.cloudcomputing.servicioweb.controller;


import java.util.ArrayList;


import com.cloudcomputing.servicioweb.model.Friends;
import com.cloudcomputing.servicioweb.services.FriendsService;
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
@RequestMapping("/friends")
public class ControllerFriends {
    @Autowired
    FriendsService friendsService;

    @GetMapping("/key="+constant.KEY+"/lista")
    public  ArrayList<Friends> listar(){

        return friendsService.listar();
    }

    @PostMapping("/key="+constant.KEY+"/insertlista")
    public Friends guardarCarreras(@RequestBody Friends friends){
        return this.friendsService.GuardarFriends(friends);

    }


    @DeleteMapping(value="/key="+constant.KEY+"/lista/{id}")
    public void DeleteMapping(@PathVariable int id){
        friendsService.delete(id);
      }


}
