package com.cloudcomputing.servicioweb.services;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.interfaces.IBilling;
import com.cloudcomputing.servicioweb.model.Billing;
import com.cloudcomputing.servicioweb.serviceinterfaces.IBillingService;

import org.springframework.beans.factory.annotation.Autowired;

public class BillingService implements IBillingService {


    @Autowired
    private IBilling data;

    
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Billing> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Billing> listar(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save(Billing b) {
        // TODO Auto-generated method stub
        return 0;
    }


    
}
