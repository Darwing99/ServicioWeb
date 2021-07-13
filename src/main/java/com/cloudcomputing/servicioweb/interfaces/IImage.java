package com.cloudcomputing.servicioweb.interfaces;

import com.cloudcomputing.servicioweb.model.Image;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IImage extends CrudRepository<Image, Integer>  {
    
}
