package com.bcopstein.business.dto;

public class PrecosDTO {
    private double subtotal;
    private double imposto;
    private double frete;
    private double desconto;
    private double total;
    
    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public PrecosDTO withSubtotal(double subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public PrecosDTO withImposto(double imposto) {
        this.imposto = imposto;
        return this;
    }

    public double getFrete() {
        return this.frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public PrecosDTO withFrete(double frete) {
        this.frete = frete;
        return this;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public PrecosDTO withDesconto(double desconto) {
        this.desconto = desconto;
        return this;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public PrecosDTO withTotal(double total) {
        this.total = total;
        return this;
    }
}
