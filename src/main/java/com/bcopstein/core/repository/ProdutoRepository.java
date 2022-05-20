package com.bcopstein.core.repository;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.business.interfaces.IProdutoRepository;

public class ProdutoRepository implements IProdutoRepository {

    public List<ProdutoDTO> listaProdutos() {
        return new ArrayList<ProdutoDTO>();
    }

    public boolean podeVender(Integer codigo, Integer quantidade) {
        List<ProdutoDTO> produtos = new ArrayList<>();

        final boolean disponivel = produtos.stream().anyMatch(p -> p.getCodigo() == codigo 
                                    && p.getSituacao().equals("A"));
        return disponivel;
    }
    
    
}
