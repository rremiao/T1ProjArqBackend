package com.bcopstein.core.services;

import java.util.List;

import javax.inject.Inject;

import com.bcopstein.core.repository.VendaRepository;
import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

public class VendaService {
    
    @Inject
    VendaRepository vendaRepository;

    public boolean confirmaVenda(final List<ItemCarrinhoDTO> itens) {
        return vendaRepository.confirmaVenda(itens);
    }

    public PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param) {
        return vendaRepository.calculaSubtotal(param);
    }

}
