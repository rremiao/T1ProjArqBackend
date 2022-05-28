package com.bcopstein.business.interfaces;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface IHistoricoRepository {
    public List<String> vendasEfetuadas();
}
