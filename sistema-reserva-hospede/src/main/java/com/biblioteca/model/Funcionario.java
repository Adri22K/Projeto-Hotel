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

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
