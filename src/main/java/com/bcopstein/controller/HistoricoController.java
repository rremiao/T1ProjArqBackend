package com.bcopstein.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historico")
public class HistoricoController {
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<String> vendasEfetuadas() {
      return new ArrayList<String>();
    }
}
