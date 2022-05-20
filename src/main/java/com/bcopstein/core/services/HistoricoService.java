package com.bcopstein.core.services;

import java.util.List;

import javax.inject.Inject;

import com.bcopstein.core.repository.HistoricoRepository;

public class HistoricoService {

    @Inject
    HistoricoRepository historicoRepository;

    public List<String> vendasEfetuadas() {
        return historicoRepository.vendasEfetuadas();
    }
}
