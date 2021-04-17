package com.cloudcomputing.servicioweb.controller;

import com.cloudcomputing.servicioweb.model.Location;
import com.cloudcomputing.servicioweb.serviceinterfaces.ILocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/")
public class ControllerLocation {
    @Autowired
    private ILocationService locationCRUD;


   //Guardar Location
   @GetMapping("/location")
   public ModelAndView getLocation(Model model){
       model.addAttribute("location",new Location());
       return new ModelAndView("location");
   }
   @PostMapping("/savelocation")
   public ModelAndView save(@Valid Location l, Model model){
       locationCRUD.save(l);
       return new ModelAndView("redirect:/location");   
   }






    
}
