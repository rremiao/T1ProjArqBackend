package com.bcopstein.business.interfaces;

import com.bcopstein.business.dto.ProdutoDTO;

import java.util.List;

public interface ICalculaImposto {
    public double calculaImpostoSimples(List<ProdutoDTO> produto);

    public double calculaImpostoComposto(List<ProdutoDTO> produto);

    public int calculaImpostoSubtotal(double subtotal);
}
