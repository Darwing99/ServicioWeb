package com.cloudcomputing.servicioweb.controller;

import com.cloudcomputing.servicioweb.model.Usuarios;
import com.cloudcomputing.servicioweb.serviceinterfaces.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

@RequestMapping
public class ControllerUsuario {

    @Autowired
    private IUsuarioService userCRUD;

    @GetMapping("/")
    public String listar( Model model) {
        model.addAttribute("usuario",new Usuarios());
          return "index";

    }
    @GetMapping("/billing")
    public String transactions(Model model){
        return "billing";
    }
    @GetMapping("/location")
    public String location(Model model){
        return "location";
    }
    @GetMapping("/users")
    public ModelAndView getHome(Model model){
        model.addAttribute("usuario",new Usuarios());
        return new ModelAndView("index");
    }
    @PostMapping("/saveUser")
    public ModelAndView save(@Valid Usuarios u, Model model){
        userCRUD.save(u);
        return new ModelAndView("redirect:/users");   
    }
}
