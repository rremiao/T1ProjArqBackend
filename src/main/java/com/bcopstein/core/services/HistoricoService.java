package com.bcopstein.core.services;

import java.util.List;

import javax.inject.Inject;

import com.bcopstein.core.repository.HistoricoRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class HistoricoService {

    @Inject
    HistoricoRepository historicoRepository;

    @Autowired
    public List<String> vendasEfetuadas() {
        return historicoRepository.vendasEfetuadas();
    }
}
