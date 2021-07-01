package com.cloudcomputing.servicioweb.interfaces;

import com.cloudcomputing.servicioweb.model.Carreras;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICarreras extends CrudRepository<Carreras, Integer> {
    
}
