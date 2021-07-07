package com.cloudcomputing.servicioweb.interfaces;

import com.cloudcomputing.servicioweb.model.Friends;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ifriends extends CrudRepository<Friends,Integer> {
    int deleteById(int id);
}
