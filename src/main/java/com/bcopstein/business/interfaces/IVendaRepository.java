package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.ItemCarrinhoDTO;
import com.bcopstein.business.dto.ParamSubtotal_DTO;
import com.bcopstein.business.dto.PrecosDTO;

public interface IVendaRepository {

    boolean confirmaVenda(final List<ItemCarrinhoDTO> itens);
    
    PrecosDTO calculaSubtotal(final ParamSubtotal_DTO param);
}
