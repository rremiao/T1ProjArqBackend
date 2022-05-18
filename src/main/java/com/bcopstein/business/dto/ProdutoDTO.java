package com.bcopstein.business.dto;

public class ProdutoDTO {
    private int codigo;
  private String descricao;
  private double preco;
  private int qtdade;
  private String urlImagem;
  private String situacao;

  public int getCodigo() {
    return codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

  public int getQtdade() {
    return qtdade;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

  public String getSituacao() {
    return situacao;
  }

  public void saidaDeProduto(int qtdade) {
    this.qtdade -= qtdade;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public ProdutoDTO withCodigo(int codigo) {
    this.codigo = codigo;
    return this;
  }

  public ProdutoDTO withDescricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  public ProdutoDTO withPreco(double preco) {
    this.preco = preco;
    return this;
  }

  public ProdutoDTO withQuantidade(int qtdade) {
    this.qtdade = qtdade;
    return this;
  }

  public ProdutoDTO withUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
    return this;
  }

  public ProdutoDTO withSituacao(String situacao) {
    this.situacao = situacao;
    return this;
  }
}
