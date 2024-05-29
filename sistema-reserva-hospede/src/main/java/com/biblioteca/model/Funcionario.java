package com.biblioteca.model;

public class Funcionario {
    private int idFuncionario;
    private String nomeCompleto;
    private String cargo;
    private String telefone;

    public Funcionario(int idFuncionario, String nomeCompleto, String cargo, String telefone) {
        this.idFuncionario = idFuncionario;
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
        this.telefone = telefone;
    }

    // Métodos de acesso para os atributos da classe Funcionário

    // Método para obter o ID do funcionário
    public int getIdFuncionario() {
        return idFuncionario;
    }

    // Método para definir o ID do funcionário
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    // Método para obter o nome completo do funcionário
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    // Método para definir o nome completo do funcionário
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Método para obter o cargo do funcionário
    public String getCargo() {
        return cargo;
    }

    // Método para definir o cargo do funcionário
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para obter o número de telefone do funcionário
    public String getTelefone() {
        return telefone;
    }

    // Método para definir o número de telefone do funcionário
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
