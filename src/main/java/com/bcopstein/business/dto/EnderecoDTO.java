package com.bcopstein.business.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {
    private String logradouro;
    private int numero;
    private String complemento;
    private String estado;
    private String cep;
    private String cidade;
    private String bairro;

    public EnderecoDTO(String logradouro, int numero, String complemento, String estado, String cep, String cidade, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public EnderecoDTO withLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoDTO withNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoDTO withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EnderecoDTO withEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public EnderecoDTO withCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoDTO withCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoDTO withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }
}
