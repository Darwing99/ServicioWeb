package com.cloudcomputing.servicioweb.interfaces;
import com.cloudcomputing.servicioweb.model.Location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ILocation extends CrudRepository<Location, Integer> {
    
}
