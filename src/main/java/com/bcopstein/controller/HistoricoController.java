package com.bcopstein.controller;

import java.util.List;


import com.bcopstein.core.services.HistoricoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/historico")
@Api(tags = "Historico")
public class HistoricoController {

    @Autowired
    HistoricoService historicoService;

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<String> vendasEfetuadas() {
      return historicoService.vendasEfetuadas();
    }
}
