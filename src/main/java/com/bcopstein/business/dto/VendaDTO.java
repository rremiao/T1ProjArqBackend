package com.bcopstein.business.dto;


public class VendaDTO {
    private int id;
    private double frete;
    private double imposto;
    private double desconto;
    private String itemsCarrinho;
    private double valorTotal;
    private EnderecoDTO endereco;

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

      public String getItemsCarrinho() {
          return itemsCarrinho;
      }

      public void setItemsCarrinhos(String itemsCarrinho) {
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

      public VendaDTO withId(int id) {
        this.id = id;
        return this;
      }

      public VendaDTO withFrete(double frete) {
          this.frete = frete;
          return this;
      }

      public VendaDTO withImposto(double imposto) {
          this.imposto = imposto;
          return this;
      }

      public VendaDTO withDesconto(double desconto) {
          this.desconto = desconto;
          return this;
      }

      public VendaDTO withItemsCarrinho(String itemsCarrinho) {
          this.itemsCarrinho = itemsCarrinho;
          return this;
      }

      public VendaDTO withValorTotal(double valorTotal) {
          this.valorTotal = valorTotal;
          return this;
      }

      public VendaDTO withEndereco(EnderecoDTO endereco) {
          this.endereco = endereco;
          return this;
      }
}
