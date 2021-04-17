package com.cloudcomputing.servicioweb.interfaces;

import com.cloudcomputing.servicioweb.model.Billing;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBilling extends CrudRepository<Billing,Integer> {
    

}
