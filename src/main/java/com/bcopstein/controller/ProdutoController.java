package com.bcopstein.controller;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<ProdutoDTO> produtos;

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<ProdutoDTO> listaProdutos() {
      return new ArrayList<ProdutoDTO>();
    }

    @GetMapping("/autorizacao")
    @CrossOrigin(origins = "*")
    public boolean podeVender(@RequestParam final Integer codigo,
                              @RequestParam final Integer quantidade) {
      final boolean disponivel = produtos.stream().anyMatch(p -> p.getCodigo() == codigo 
                                    && p.getSituacao().equals("A"));
      return disponivel;
    }
}
