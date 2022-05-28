package com.bcopstein.core.services;

import java.util.List;


import com.bcopstein.core.repository.HistoricoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService {

    @Autowired
    HistoricoRepository historicoRepository;

    public List<String> vendasEfetuadas() {
        return historicoRepository.vendasEfetuadas();
    }
}
