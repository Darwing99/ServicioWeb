package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Location;

public interface ILocationService {
    public List<Location> listar();

    public Optional<Location> listar(int id);

    public void save(Location l);
    
    public void delete(int id);
}



