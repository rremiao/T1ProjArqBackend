package com.bcopstein.core.repository;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.business.entity.Produto;
import com.bcopstein.business.interfaces.IProdutoRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public abstract class ProdutoRepository implements IProdutoRepository  {

    @Query(value = "SELECT * from vendas")
    public List<ProdutoDTO> listaProdutos() {
        Iterable<Produto> produtos = this.findAll();
        List<ProdutoDTO> response = new ArrayList<ProdutoDTO>();

        for(Produto prod : produtos) {
            ProdutoDTO produto = new ProdutoDTO();

            produto.withCodigo(prod.getCodigo());

            response.add(produto);
        }
        return response;
    }

    public boolean podeVender(Integer codigo, Integer quantidade) {
        List<ProdutoDTO> produtos = new ArrayList<>();

        final boolean disponivel = produtos.stream().anyMatch(p -> p.getCodigo() == codigo 
                                    && p.getSituacao().equals("A"));
        return disponivel;
    }
}
