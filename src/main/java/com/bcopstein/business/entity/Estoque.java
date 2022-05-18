package com.bcopstein.business.entity;

public class Estoque {
    private int id;
    private int estoqueMinimo;
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
