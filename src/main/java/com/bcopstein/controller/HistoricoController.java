package com.bcopstein.controller;

import java.util.List;

import javax.ejb.EJB;

import com.bcopstein.core.services.HistoricoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @EJB
    HistoricoService historicoService;

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<String> vendasEfetuadas() {
      return historicoService.vendasEfetuadas();
    }
}
