package com.bcopstein.core.services;

import com.bcopstein.business.dto.EnderecoDTO;
import com.bcopstein.core.repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository repository;

    public EnderecoDTO buscaEndereco(int codigo) {
        return repository.buscaEndereco(codigo);
    }
}
