package com.cloudcomputing.servicioweb.services;

import java.util.ArrayList;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.Ifriends;
import com.cloudcomputing.servicioweb.model.Friends;
import com.cloudcomputing.servicioweb.serviceinterfaces.IFriendsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FriendsService implements IFriendsService {


    @Autowired
    private Ifriends friends;

    @Override
    public ArrayList<Friends> listar() {
        
        return  (ArrayList<Friends>)friends.findAll();
    }

    @Override
    public Optional<Friends> listar(int id) {
      
        return this.friends.findById(id);
    }

    @Override
    public void save(Friends u) {
        friends.save(u);
        
    }


    public Friends GuardarFriends(Friends u){
        return friends.save(u);

    }


    @Override
    public boolean delete(int id){
        try {
             friends.deleteById(id);
             return true;
            
        } catch (Exception e) {
           return false;
        }

    }
    
}
