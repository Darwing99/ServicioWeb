package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Usuarios;

public interface IUsuarioService {
    public List<Usuarios> listar();
    public Optional<Usuarios> listar(int id);
    public int save(Usuarios u);
    public void delete(int id);

    
}
