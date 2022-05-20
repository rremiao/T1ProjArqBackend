package com.bcopstein.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Produto")
@Table(name = "produto")
public class Produto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "codigo")
  private int codigo;

  @Column(name = "descricao")
  private String descricao;

  @Column(name = "preco")
  private double preco;

  @Column(name = "quantidade")
  private int qtdade;

  @Column(name = "urlImagem")
  private String urlImagem;

  @Column(name = "situacao")
  private String situacao;

  public Produto(int codigo, String descricao, double preco, int qtdade, String urlImagem, String situacao) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
    this.qtdade = qtdade;
    this.urlImagem = urlImagem;
    this.situacao = situacao;
  }

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

  public Produto withCodigo(int codigo) {
    this.codigo = codigo;
    return this;
  }

  public Produto withDescricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  public Produto withPreco(double preco) {
    this.preco = preco;
    return this;
  }

  public Produto withQuantidade(int qtdade) {
    this.qtdade = qtdade;
    return this;
  }

  public Produto withUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
    return this;
  }

  public Produto withSituacao(String situacao) {
    this.situacao = situacao;
    return this;
  }
 
 
  @Override
  public String toString() {
    return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco
        + ", qtdade=" + qtdade + "]";
  }
}
