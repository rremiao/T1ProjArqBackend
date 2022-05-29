package com.bcopstein.business.interfaces;

import java.util.List;

import com.bcopstein.business.dto.VendaDTO;

import org.springframework.stereotype.Repository;


@Repository
public interface IHistoricoRepository {
    public List<VendaDTO> vendasEfetuadas();
}
