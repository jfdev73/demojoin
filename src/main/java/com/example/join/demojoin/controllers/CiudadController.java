package com.example.join.demojoin.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.join.demojoin.models.Ciudad;
import com.example.join.demojoin.services.CiudadService;

@Controller
@RequestMapping("/ciudades")
public class CiudadController {
  @Autowired
  CiudadService ciudadService;

  @GetMapping("/all")
  public String get(Model model) {

    System.out.println("Entro al metodo ciudades ");
    model.addAttribute("ciudades", ciudadService.getCiudades());
    return "cities";

  }

}
