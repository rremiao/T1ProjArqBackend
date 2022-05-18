package com.bcopstein.business.dto;

public class ItemCarrinhoDTO {
    private int codigo;
    private int quantidade;
    private ProdutoDTO produto;
    private double imposto;
    private double desconto;
    private double custo;
  
    public ItemCarrinhoDTO(int codigo, int quantidade, ProdutoDTO produto, double imposto, double desconto, double custo) {
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
  
    public ProdutoDTO getProduto() {
      return produto;
    }
  
    public void setProduto(ProdutoDTO produto) {
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
  
    public ItemCarrinhoDTO withCodigo(int codigo) {
      this.codigo = codigo;
      return this;
    }
  
    public ItemCarrinhoDTO withQuantidade(int quantidade) {
      this.quantidade = quantidade;
      return this;
    }
  
    public ItemCarrinhoDTO withProduto(ProdutoDTO produto) {
      this.produto = produto;
      return this;
    }
  
    public ItemCarrinhoDTO withImposto(double imposto) {
      this.imposto = imposto;
      return this;
    }
  
    public ItemCarrinhoDTO withDesconto(double desconto) {
      this.desconto = desconto;
      return this;
    }
  
    public ItemCarrinhoDTO withCusto(double custo) {
      this.custo = custo;
      return this;
    }
}
