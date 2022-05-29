package com.bcopstein.core.implementation;

import javax.transaction.Transactional;

import com.bcopstein.business.entity.Venda;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface VendaOperationRepository extends JpaRepository<Venda, Integer>{
    
}
