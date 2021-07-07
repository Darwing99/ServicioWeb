package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Friends;

public interface IFriendsService {
    public List<Friends> listar();
    public Optional<Friends> listar(int id);
    public  void save(Friends u);
    public void delete(int id);
}
