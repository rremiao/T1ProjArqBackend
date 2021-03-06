package com.bcopstein.controller;

import java.util.List;

import com.bcopstein.business.dto.VendaDTO;
import com.bcopstein.core.services.HistoricoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    HistoricoService historicoService;

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<VendaDTO> vendasEfetuadas() {
      return historicoService.vendasEfetuadas();
    }
}
