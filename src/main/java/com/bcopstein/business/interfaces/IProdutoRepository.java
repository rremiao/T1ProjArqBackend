package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;

public interface IProdutoRepository {
    public List<ProdutoDTO> listaProdutos();
}
