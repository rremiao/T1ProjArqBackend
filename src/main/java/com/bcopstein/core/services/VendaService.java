package com.bcopstein.core.services;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.core.implementation.CalculaImpostoImpl;
import com.bcopstein.core.implementation.CalculaLimiteHorarioImpl;
import com.bcopstein.core.repository.VendaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;
import com.bcopstein.business.dto.VendaDTO;

@Service
public class VendaService {
    
    @Autowired
    VendaRepository vendaRepository;

    @Autowired
    CalculaImpostoImpl calculaImpostoImpl;


    @Autowired
    CalculaLimiteHorarioImpl calculaLimiteHorario;

    public boolean confirmaVenda(final String itens) {
        ObjectMapper mapper = new ObjectMapper();

        List<ItemCarrinhoDTO> myItems = new ArrayList<>();
        try {
          myItems = mapper.readValue(itens, new TypeReference<List<ItemCarrinhoDTO>>() {});
        } catch (JsonMappingException e) {
          e.printStackTrace();
        } catch (JsonProcessingException e) {
          e.printStackTrace();
        }
        return vendaRepository.confirmaVenda(myItems);
    }

    public PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param) {
      PrecosDTO response = vendaRepository.calculaSubtotal(param);

      response.withFrete(calculaImpostoImpl.calculaImpostoSubtotal(response.getSubtotal()));

      return response;
    }

    public List<VendaDTO> listaVendas() {
        return vendaRepository.listaVenda();
    }

}
