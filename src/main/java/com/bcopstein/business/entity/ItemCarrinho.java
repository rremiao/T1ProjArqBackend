package com.bcopstein.business.entity;

import java.io.Serializable;

public class ItemCarrinho implements Serializable {
  private int codigo;
  private int quantidade;
  private Produto produto;
  private double imposto;
  private double desconto;
  private double custo;

  public ItemCarrinho(int codigo, int quantidade, Produto produto, double imposto, double desconto, double custo) {
    this.codigo = codigo;
    this.quantidade = quantidade;
    this.produto = produto;
    this.imposto = imposto;
    this.desconto = desconto;
    this.custo = custo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public double getImposto() {
    return imposto;
  }

  public void setImposto(double imposto) {
    this.imposto = imposto;
  }

  public double getDesconto() {
    return desconto;
  }

  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }

  public double getCusto() {
    return custo;
  }

  public void setCusto(double custo) {
    this.custo = custo;
  }

  public ItemCarrinho withCodigo(int codigo) {
    this.codigo = codigo;
    return this;
  }

  public ItemCarrinho withQuantidade(int quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  public ItemCarrinho withProduto(Produto produto) {
    this.produto = produto;
    return this;
  }

  public ItemCarrinho withImposto(double imposto) {
    this.imposto = imposto;
    return this;
  }

  public ItemCarrinho withDesconto(double desconto) {
    this.desconto = desconto;
    return this;
  }

  public ItemCarrinho withCusto(double custo) {
    this.custo = custo;
    return this;
  }

  @Override
  public String toString() {
    return "ItemCarrinho [codigo=" + codigo + ", qtd=" + quantidade + "]";
  }
}
