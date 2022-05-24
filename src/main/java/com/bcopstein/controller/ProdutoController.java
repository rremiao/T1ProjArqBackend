package com.bcopstein.controller;

import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.core.services.ProdutoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    ProdutoService produtoService;

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public List<ProdutoDTO> listaProdutos() {
      return produtoService.listaProdutos();
    }

    @GetMapping("/autorizacao")
    @CrossOrigin(origins = "*")
    public boolean podeVender(@RequestParam final Integer codigo,
                              @RequestParam final Integer quantidade) {
      return produtoService.podeVender(codigo, quantidade);
    }
}
