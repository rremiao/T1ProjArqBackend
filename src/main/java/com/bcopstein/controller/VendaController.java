package com.bcopstein.controller;

import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

import com.bcopstein.core.services.VendaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendas")
public class VendaController {

  @Autowired
  VendaService vendaService;

  @PostMapping("/confirmacao")
  @CrossOrigin(origins = "*")
  public boolean confirmaVenda(@RequestBody final String itens) {
    return vendaService.confirmaVenda(itens);
  }

  @PostMapping("/subtotal")
  @CrossOrigin(origins = "*")
  public PrecosDTO calculaSubtotal(@RequestBody final ParamSubtotal_DTO param) {    
    return vendaService.calculaSubtotal(param);
  }
}