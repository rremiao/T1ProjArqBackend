package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.business.entity.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IProdutoRepository  extends CrudRepository<Produto, Integer> {
    public List<ProdutoDTO> listaProdutos();
}
