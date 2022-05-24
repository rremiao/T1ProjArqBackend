package com.bcopstein.controller;


import java.util.List;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

import com.bcopstein.core.services.VendaService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/vendas")
public class VendaController {

  VendaService vendaService;

  @PostMapping("/confirmacao")
  @CrossOrigin(origins = "*")
  public boolean confirmaVenda(@RequestBody final List<ItemCarrinhoDTO> itens) {
    return vendaService.confirmaVenda(itens);
  }

  @PostMapping("/subtotal")
  @CrossOrigin(origins = "*")
  public PrecosDTO calculaSubtotal(@RequestBody final ParamSubtotal_DTO param) {
          // Verifica se o endereço é invalido
         if (param.getEndereco() == null ||
         param.getEndereco().isEmpty() ||
         param.getEndereco().isBlank()) {
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Endereco invalido");
        }
    return vendaService.calculaSubtotal(param);
  }}