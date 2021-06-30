package com.cloudcomputing.servicioweb.interfaces;


import com.cloudcomputing.servicioweb.model.Usuarios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarios extends CrudRepository<Usuarios, Integer> {
   

   
}
