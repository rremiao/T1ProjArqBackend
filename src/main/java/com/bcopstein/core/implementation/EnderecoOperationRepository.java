package com.bcopstein.core.implementation;

import javax.transaction.Transactional;

import com.bcopstein.business.entity.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface EnderecoOperationRepository extends JpaRepository<Endereco, Integer> {
    
}
