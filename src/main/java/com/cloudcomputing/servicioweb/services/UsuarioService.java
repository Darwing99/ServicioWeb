package com.cloudcomputing.servicioweb.services;

import java.util.ArrayList;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.IUsuarios;
import com.cloudcomputing.servicioweb.model.Usuarios;
import com.cloudcomputing.servicioweb.serviceinterfaces.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarios data;
    

    @Override
    public void delete(int id) {
        
    }
    // listar con GET
    @Override
        public ArrayList<Usuarios>listar() {
          
            return (ArrayList<Usuarios>)data.findAll();
        }

    @Override
    public Optional<Usuarios> listar(int id) {
      
        return null;
    }

    @Override
    public void save(Usuarios u) {
          data.save(u);
      
    }


    //guardar con POST
    public Usuarios guardaUsuarios(Usuarios users){
        return data.save(users);

    }


    //actualizar si va con id
    public Optional<Usuarios> obtenerPorid(int id){
        return data.findById(id);

    }

  
    //eliminar si asi se desea
    public boolean eliminarUsuario(int id){
        try {
             data.deleteById(id);
             return true;
            
        } catch (Exception e) {
           return false;
        }

    }
    
    
    
}
