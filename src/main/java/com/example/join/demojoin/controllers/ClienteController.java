package com.example.join.demojoin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.join.demojoin.services.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
  @Autowired
  ClienteService clienteService;

  @GetMapping("/all")
  public String getCl(Model model) {
    model.addAttribute("clients", clienteService.getClientes());
    return "clientes";

  }

}
