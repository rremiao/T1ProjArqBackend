package com.bcopstein.core.services;

import java.util.List;

import javax.ejb.EJB;

import com.bcopstein.core.repository.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

public class VendaService {
    
    @EJB
    VendaRepository vendaRepository;

    @Autowired
    public boolean confirmaVenda(final List<ItemCarrinhoDTO> itens) {
        return vendaRepository.confirmaVenda(itens);
    }

    @Autowired
    public PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param) {
        return vendaRepository.calculaSubtotal(param);
    }

}
