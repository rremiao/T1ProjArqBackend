package com.bcopstein.core.services;

import java.util.List;

import com.bcopstein.core.repository.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

@Service
public class VendaService {
    
    @Autowired
    VendaRepository vendaRepository;

    public boolean confirmaVenda(final List<ItemCarrinhoDTO> itens) {
        return vendaRepository.confirmaVenda(itens);
    }

    public PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param) {
        return vendaRepository.calculaSubtotal(param);
    }

}
