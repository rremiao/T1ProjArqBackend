package com.bcopstein.core.repository;

import java.util.Optional;

import com.bcopstein.business.dto.EnderecoDTO;
import com.bcopstein.business.entity.Endereco;
import com.bcopstein.business.interfaces.IEnderecoRepository;
import com.bcopstein.core.implementation.EnderecoOperationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EnderecoRepository extends IEnderecoRepository {
    
    @Autowired
    EnderecoOperationRepository operationRepository;

    public EnderecoDTO buscaEndereco(int codigo) {
        EnderecoDTO addr = new EnderecoDTO();

        Optional<Endereco> optAddr = operationRepository.findById(codigo);
        Endereco myAddr = optAddr.get();

        addr.withLogradouro(myAddr.getLogradouro())
            .withNumero(myAddr.getNumero())
            .withComplemento(myAddr.getComplemento())
            .withEstado(myAddr.getEstado())
            .withCep(myAddr.getCep())
            .withBairro(myAddr.getBairro())
            .withCidade(myAddr.getCidade());

        
        return addr;       
    }
}
