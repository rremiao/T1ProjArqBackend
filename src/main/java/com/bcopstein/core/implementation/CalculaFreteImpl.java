package com.bcopstein.core.implementation;


import com.bcopstein.business.dto.EnderecoDTO;
import com.bcopstein.business.interfaces.ICalculaFrete;
import com.bcopstein.core.services.BingIntegrationService;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculaFreteImpl implements ICalculaFrete {

    @Autowired
    BingIntegrationService integrationService;

    public double calculaFreteSimples(EnderecoDTO enderecoDestino, EnderecoDTO enderecoSede) {
        double distancia = this.calculaDistancia(enderecoDestino.getCep(), enderecoSede.getCep());
        return distancia;
    }

    public double calculaFreteBing(EnderecoDTO enderecoDestino, EnderecoDTO enderecoSede) {
        double distancia = this.integrationService.calculoFreteBing(enderecoDestino.getCep(), enderecoSede.getCep());
        return distancia;
    }

    private double calculaDistancia(String cepDestino, String cepSede) {
        if(Integer.parseInt(cepDestino) > Integer.parseInt(cepSede)) return (double) Integer.parseInt(cepDestino) - Integer.parseInt(cepSede); 
        if(Integer.parseInt(cepSede) > Integer.parseInt(cepDestino)) return (double) Integer.parseInt(cepSede) - Integer.parseInt(cepDestino);
        if(Integer.parseInt(cepSede) == Integer.parseInt(cepDestino)) return 0.0;
        return 25.0;
    }

}
