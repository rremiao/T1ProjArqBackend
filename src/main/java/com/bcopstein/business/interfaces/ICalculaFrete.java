package com.bcopstein.business.interfaces;

import com.bcopstein.business.dto.EnderecoDTO;

public interface ICalculaFrete {
    public double calculaFreteSimples(EnderecoDTO enderecoDestino, EnderecoDTO enderecoSede);

    public double calculaFreteBing(EnderecoDTO enderecoDestino, EnderecoDTO enderecoSede);
}
