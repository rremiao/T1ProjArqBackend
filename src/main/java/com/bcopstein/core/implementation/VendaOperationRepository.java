package com.bcopstein.core.implementation;

import com.bcopstein.business.entity.Venda;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaOperationRepository extends JpaRepository<Venda, Integer>{
    
}
