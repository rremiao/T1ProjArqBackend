package com.bcopstein.core.repository;

import java.util.List;

import com.bcopstein.business.dto.VendaDTO;
import com.bcopstein.business.interfaces.IHistoricoRepository;
import com.bcopstein.core.services.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoricoRepository implements IHistoricoRepository {

    @Autowired
    VendaService vendaService;

    public List<VendaDTO> vendasEfetuadas() {
        return vendaService.listaVendas();
    }
}
