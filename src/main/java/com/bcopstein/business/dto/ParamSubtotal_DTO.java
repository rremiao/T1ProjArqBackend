package com.bcopstein.business.dto;

import java.util.List;


public class ParamSubtotal_DTO {
    private List<ItemCarrinhoDTO> itens;
    private String endereco;

    public ParamSubtotal_DTO(List<ItemCarrinhoDTO> itens, String endereco) {
        this.itens = itens;
        this.endereco = endereco;
    }

    public List<ItemCarrinhoDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinhoDTO> itens) {
        this.itens = itens;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
}
