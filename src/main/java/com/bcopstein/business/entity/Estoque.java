package com.bcopstein.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "estoque")
@Table(name = "estoque")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "estoque_minimo")
    private int estoqueMinimo;

    @Column(name = "id_produto")
    private int idProduto;

    public Estoque(int id, int estoqueMinimo, int idProduto) {
        this.id = id;
        this.estoqueMinimo = estoqueMinimo;
        this.idProduto = idProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    } 

    public Estoque withId(int id) {
        this.id = id;
        return this;
    }

    public Estoque withEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
        return this;
    }
    
    public Estoque withIdProduto(int idProduto) {
        this.idProduto = idProduto;
        return this;
    }
}
