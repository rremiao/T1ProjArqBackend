package com.bcopstein.business.entity;

import java.util.List;

import com.bcopstein.business.dto.EnderecoDTO;

public class Venda {
    private int id;
    private double frete;
    private double imposto;
    private double desconto;
    private List<Produto> listaProdutos;
    private List<ItemCarrinho> itemsCarrinho;
    private double valorTotal;
    private EnderecoDTO endereco;

    public Venda(int id, double frete, double imposto, double desconto, 
                        List<Produto> listaProdutos, List<ItemCarrinho> itemsCarrinho, double valorTotal, EnderecoDTO endereco) {
        this.id = id;
        this.frete = frete;
        this.imposto = imposto;
        this.desconto = desconto;
        this.listaProdutos = listaProdutos;
        this.itemsCarrinho = itemsCarrinho;
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

      public List<Produto> getListaProdutos() {
          return listaProdutos;
      }

      public void setListaProdutos(List<Produto> listaProdutos) {
          this.listaProdutos = listaProdutos;
      }

      public List<ItemCarrinho> getItemsCarrinho() {
          return itemsCarrinho;
      }

      public void setItemsCarrinhos(List<ItemCarrinho> itemsCarrinho) {
          this.itemsCarrinho = itemsCarrinho;
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

      public Venda withListaProdutos(List<Produto> listaProdutos) {
          this.listaProdutos = listaProdutos;
          return this;
      }

      public Venda withItemsCarrinho(List<ItemCarrinho> itemsCarrinho) {
          this.itemsCarrinho = itemsCarrinho;
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
