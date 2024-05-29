package com.biblioteca.controller;

import java.util.List;

import com.biblioteca.model.Funcionario;
import com.biblioteca.model.dao.FuncionarioDAO;

// Controlador para operações relacionadas a funcionarios
public class FuncionarioController {
    private FuncionarioDAO funcionarioDAO;

    // Construtor que realiza a injeção de dependência de FuncionarioDAO
    public FuncionarioController() {
        funcionarioDAO = new FuncionarioDAO(); // Instancia um objeto FuncionarioDAO para interação com o banco de dados
    }

    // Método para recuperar todos os funcionarios
    // Retorna uma lista de funcionarios
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioDAO.getAllFuncionarios();
    }

    // Método para adicionar um funcionario
    // Recebe um objeto Funcionario como parâmetro
    public void addFuncionario(Funcionario funcionario) {
        funcionarioDAO.addFuncionario(funcionario);
    }

    // Método para atualizar um funcionario
    // Recebe um objeto Funcionario como parâmetro
    public void updateFuncionario(Funcionario funcionario) {
        funcionarioDAO.updateFuncionario(funcionario);
    }

    // Método para deletar um funcionario
    // Recebe o ID do funcionario a ser deletado como parâmetro
    public void deleteFuncionario(int id) {
        funcionarioDAO.deleteFuncionario(id);
    }
}
