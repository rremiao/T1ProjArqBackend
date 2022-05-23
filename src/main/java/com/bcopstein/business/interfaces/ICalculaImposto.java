package com.bcopstein.business.interfaces;

import com.bcopstein.business.dto.ProdutoDTO;

public interface ICalculaImposto {
    public double calculaImpostoSimples(ProdutoDTO produto);

    public double calculaImpostoComposto(ProdutoDTO produto);
}
