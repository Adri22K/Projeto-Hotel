package com.biblioteca.model;

public class TipoQuarto {
    private int idTipo;
    private String caracteristica;
    private String descricao;
    private int capacidade;
    private double precoNoite;

    // Construtor da classe TipoQuarto
    public TipoQuarto(int idTipo, String caracteristica, String descricao, int capacidade, double precoNoite) {
        this.idTipo = idTipo;
        this.caracteristica = caracteristica;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.precoNoite = precoNoite;
    }

    // Métodos de acesso para os atributos da classe TipoQuarto

    // Método para obter o ID do tipo de quarto
    public int getIdTipo() {
        return idTipo;
    }

    // Método para definir o ID do tipo de quarto
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // Método para obter a característica do tipo de quarto
    public String getCaracteristica() {
        return caracteristica;
    }

    // Método para definir a característica do tipo de quarto
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // Método para obter a descrição do tipo de quarto
    public String getDescricao() {
        return descricao;
    }

    // Método para definir a descrição do tipo de quarto
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a capacidade do tipo de quarto
    public int getCapacidade() {
        return capacidade;
    }

    // Método para definir a capacidade do tipo de quarto
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Método para obter o preço por noite do tipo de quarto
    public double getPrecoNoite() {
        return precoNoite;
    }

    // Método para definir o preço por noite do tipo de quarto
    public void setPrecoNoite(double precoNoite) {
        this.precoNoite = precoNoite;
    }
}
