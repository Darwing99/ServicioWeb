package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Carreras;

public interface ICarrerasService {
    public List<Carreras> listar();
    public Optional<Carreras> listar(int id);
    public  void save(Carreras u);
    public void delete(int id);
}
