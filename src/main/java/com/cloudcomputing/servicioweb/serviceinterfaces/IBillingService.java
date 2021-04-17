package com.cloudcomputing.servicioweb.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import com.cloudcomputing.servicioweb.model.Billing;

public interface IBillingService {
    public List<Billing> listar();

    public Optional<Billing> listar(int id);

    public int save(Billing b);
    
    public void delete(int id);
    
}
