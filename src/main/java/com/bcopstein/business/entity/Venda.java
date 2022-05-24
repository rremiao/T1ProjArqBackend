package com.bcopstein.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bcopstein.business.dto.EnderecoDTO;

@Entity(name = "Venda")
@Table(name="venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "frete")
    private double frete;

    @Column(name = "imposto")
    private double imposto;

    @Column(name = "desconto")
    private double desconto;

    @Column(name = "itemsCarrinho")
    private String itemsCarrinhoJson;

    @Column(name = "valor")
    private double valorTotal;

    @Column(name = "endereco")
    private EnderecoDTO endereco;

    public Venda(int id, double frete, double imposto, double desconto, String itemsCarrinhoJson, double valorTotal, EnderecoDTO endereco) {
        this.id = id;
        this.frete = frete;
        this.imposto = imposto;
        this.desconto = desconto;
        this.itemsCarrinhoJson = itemsCarrinhoJson;
        this.valorTotal = valorTotal;
        this.endereco = endereco;
      }

      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public double getFrete() {
          return frete;
      }

      public void setFrete(double frete) {
          this.frete = frete;
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

      public double getValorTotal() {
          return valorTotal;
      }

      public void setValorTotal(double valorTotal) {
          this.valorTotal = valorTotal;
      }

      public EnderecoDTO getEndereco() {
          return endereco;
      }

      public void setEndereco(EnderecoDTO endereco) {
          this.endereco = endereco;
      }

      public Venda withId(int id) {
        this.id = id;
        return this;
      }

      public Venda withFrete(double frete) {
          this.frete = frete;
          return this;
      }

      public Venda withImposto(double imposto) {
          this.imposto = imposto;
          return this;
      }

      public Venda withDesconto(double desconto) {
          this.desconto = desconto;
          return this;
      }

      public Venda withValorTotal(double valorTotal) {
          this.valorTotal = valorTotal;
          return this;
      }

      public Venda withEndereco(EnderecoDTO endereco) {
          this.endereco = endereco;
          return this;
      }
}
