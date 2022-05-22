package com.bcopstein.core.services;

import java.util.List;

import javax.inject.Inject;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.core.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoService {
    @Inject
    ProdutoRepository produtoRepository;

    @Autowired
    public List<ProdutoDTO> listaProdutos() {
        return produtoRepository.listaProdutos();
    }

    @Autowired
    public boolean podeVender(Integer codigo, Integer quantidade) {
        return produtoRepository.podeVender(codigo, quantidade);
    }

}
