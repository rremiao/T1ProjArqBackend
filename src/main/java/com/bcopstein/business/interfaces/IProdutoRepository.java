package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository {
    public List<ProdutoDTO> listaProdutos();
}
