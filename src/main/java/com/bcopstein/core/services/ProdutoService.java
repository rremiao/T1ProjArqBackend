package com.bcopstein.core.services;

import java.util.List;

import javax.ejb.EJB;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.core.repository.ProdutoRepository;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @EJB
    ProdutoRepository produtoRepository;

    public List<ProdutoDTO> listaProdutos() {
        return produtoRepository.listaProdutos();
    }

    public boolean podeVender(Integer codigo, Integer quantidade) {
        return produtoRepository.podeVender(codigo, quantidade);
    }

}
