package com.cloudcomputing.servicioweb.controller;

import com.cloudcomputing.servicioweb.model.Usuarios;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping()
public class verPage {
  
    @GetMapping("/")
    public String listar( Model model) {
        model.addAttribute("usuario",new Usuarios());
          return "index";
    }
  
 
}
