package com.bcopstein.core.implementation;

import com.bcopstein.business.dto.ProdutoDTO;
import com.bcopstein.business.interfaces.ICalculaImposto;

public class CalculaImpostoImpl implements ICalculaImposto {

    public double calculaImpostoSimples(ProdutoDTO produto) {
        if(produto.getCodigo() == 1) return 20.0;
        if(produto.getCodigo() == 2) return 10.0;
        if(produto.getCodigo() == 3) return 15.0;
        
        return 0.0;
    }

    public double calculaImpostoComposto(ProdutoDTO produto) {
        if(produto.getCodigo() == 1 && produto.getPreco() < 25.0) return 30.0;
        if(produto.getCodigo() == 1 && produto.getPreco() > 25.0) return 10.0;
        if(produto.getCodigo() == 2 && produto.getPreco() > 25.0) return 50.0;
        if(produto.getCodigo() == 2 && produto.getPreco() < 25.0) return 12.0;
        if(produto.getCodigo() == 3 && produto.getPreco() > 25.0) return 70.0;
        if(produto.getCodigo() == 3 && produto.getPreco() < 25.0) return 7.0;

        return 0.0;
    }
    
}
