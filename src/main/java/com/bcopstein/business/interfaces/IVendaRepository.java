package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

public interface IVendaRepository {

    public boolean confirmaVenda(final List<ItemCarrinhoDTO> itens);
    
    public PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param);
}
