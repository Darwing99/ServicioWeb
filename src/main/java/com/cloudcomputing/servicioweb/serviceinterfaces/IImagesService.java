package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Image;

public interface IImagesService {
    public List<Image> listar();
    public Optional<Image> listar(int id);
    public  void save(Image u);
    public boolean delete(int id);

}
