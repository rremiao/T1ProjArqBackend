package com.bcopstein.business.dto;

public class SedeDTO {
    private int id;
    private EnderecoDTO endereco;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SedeDTO withId(int id) {
        this.id = id;
        return this;
    }

    public EnderecoDTO getEndereco() {
        return this.endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public SedeDTO withEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
        return this;
    }
}
