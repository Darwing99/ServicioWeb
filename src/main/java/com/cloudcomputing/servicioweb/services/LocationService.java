package com.cloudcomputing.servicioweb.services;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.ILocation;
import com.cloudcomputing.servicioweb.model.Location;
import com.cloudcomputing.servicioweb.serviceinterfaces.ILocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService implements ILocationService  {


    @Autowired
    private ILocation data;

    
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Location> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Location> listar(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Location l) {
        data.save(l);
    }
    
}
