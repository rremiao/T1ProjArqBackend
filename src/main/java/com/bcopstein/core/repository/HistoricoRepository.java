package com.bcopstein.core.repository;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.business.interfaces.IHistoricoRepository;

import org.springframework.stereotype.Repository;

@Repository
public class HistoricoRepository implements IHistoricoRepository {

    public List<String> vendasEfetuadas() {
        return new ArrayList<String>();
    }
}
