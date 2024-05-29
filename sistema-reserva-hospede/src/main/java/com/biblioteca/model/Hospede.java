package com.biblioteca.model;

import java.util.Date;

public class Hospede {
    private int idHospedes;
    private String nomeCompleto;
    private Date dtNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

     // Construtor da classe Hóspede
    public Hospede(int idHospedes, String nomeCompleto, Date dtNascimento, String endereco, String telefone, String email, String cpf) {
        this.idHospedes = idHospedes;
        this.nomeCompleto = nomeCompleto;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    // Métodos de acesso para os atributos da classe Hóspede

    // Método para obter o ID do hóspede
    public int getIdHospedes() {
        return idHospedes;
    }

     // Método para definir o ID do hóspede
    public void setIdHospedes(int idHospedes) {
        this.idHospedes = idHospedes;
    }

    // Método para obter o nome completo do hóspede
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    // Método para definir o nome completo do hóspede
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Método para obter a data de nascimento do hóspede
    public Date getDtNascimento() {
        return dtNascimento;
    }

    // Método para definir a data de nascimento do hóspede
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    // Método para obter o endereço do hóspede
    public String getEndereco() {
        return endereco;
    }

    // Método para definir o endereço do hóspede
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para obter o número de telefone do hóspede
    public String getTelefone() {
        return telefone;
    }

    // Método para definir o número de telefone do hóspede
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para obter o email do hóspede
    public String getEmail() {
        return email;
    }

    // Método para definir o email do hóspede
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para obter o CPF do hóspede
    public String getCpf() {
        return cpf;
    }

    // Método para definir o CPF do hóspede
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
