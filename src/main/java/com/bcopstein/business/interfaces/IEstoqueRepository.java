package com.bcopstein.business.interfaces;

import com.bcopstein.business.entity.Estoque;

import org.springframework.data.repository.CrudRepository;

public interface IEstoqueRepository extends CrudRepository<Estoque, Integer> {
    
}
