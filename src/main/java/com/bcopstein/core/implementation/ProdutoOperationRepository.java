package com.bcopstein.core.implementation;

import javax.transaction.Transactional;

import com.bcopstein.business.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ProdutoOperationRepository extends JpaRepository<Produto, Integer> {

}
