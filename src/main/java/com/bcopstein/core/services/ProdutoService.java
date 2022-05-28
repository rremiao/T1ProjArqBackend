package com.bcopstein.core.services;

import java.util.List;


import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.core.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoDTO> listaProdutos() {
        return produtoRepository.listaProdutos();
    }

    public boolean podeVender(Integer codigo, Integer quantidade) {
        return produtoRepository.podeVender(codigo, quantidade);
    }

    public ProdutoDTO buscaProduto(Integer codigo) {
        return produtoRepository.buscaProduto(codigo);
    }

}
