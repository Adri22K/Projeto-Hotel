package com.biblioteca.model;

public class Quarto {
    private int idQuarto;
    private int numQuarto;
    private String tipo;
    private double preco;
    private int idTipo;

    // Construtor da classe Quarto
    public Quarto(int idQuarto, int numQuarto, String tipo, double preco, int idTipo) {
        this.idQuarto = idQuarto;
        this.numQuarto = numQuarto;
        this.tipo = tipo;
        this.preco = preco;
        this.idTipo = idTipo;
    }

    // Métodos de acesso para os atributos da classe Quarto

    // Método para obter o ID do quarto
    public int getIdQuarto() {
        return idQuarto;
    }

    // Método para definir o ID do quarto
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    // Método para obter o número do quarto
    public int getNumQuarto() {
        return numQuarto;
    }

    // Método para definir o número do quarto
    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    // Método para obter o tipo do quarto
    public String getTipo() {
        return tipo;
    }

    // Método para definir o tipo do quarto
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para obter o preço do quarto
    public double getPreco() {
        return preco;
    }

    // Método para definir o preço do quarto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para obter o ID do tipo de quarto
    public int getIdTipo() {
        return idTipo;
    }

    // Método para definir o ID do tipo de quarto
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
}
