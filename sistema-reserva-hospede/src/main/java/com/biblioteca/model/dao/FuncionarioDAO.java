package com.biblioteca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.config.DatabaseConnection;
import com.biblioteca.model.Funcionario;


// Classe responsável por acessar e manipular dados relacionados aos funcionários no banco de dados
public class FuncionarioDAO {

    // Método para recuperar todos os funcionários do banco de dados

    public List<Funcionario> getAllFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Funcionarios"; // Query para selecionar todos os funcionários
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Loop para iterar sobre o resultado e criar objetos Funcionario
            while (rs.next()) {
                Funcionario funcionario = new Funcionario(
                        rs.getInt("id_funcionario"),
                        rs.getString("nome_completo"),
                        rs.getString("cargo"),
                        rs.getString("telefone")
                );
                funcionarios.add(funcionario); // Adiciona o objeto Funcionario à lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
        return funcionarios; // Retorna a lista de funcionários recuperados do banco de dados
    }

    // Método para adicionar um novo funcionário ao banco de dados
    public void addFuncionario(Funcionario funcionario) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Query para inserir um novo funcionário
            String query = "INSERT INTO Funcionarios (id_funcionario, nome_completo, cargo, telefone) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, funcionario.getIdFuncionario());
            stmt.setString(2, funcionario.getNomeCompleto());
            stmt.setString(3, funcionario.getCargo());
            stmt.setString(4, funcionario.getTelefone());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

    // Método para atualizar as informações de um funcionário existente no banco de dados
    public void updateFuncionario(Funcionario funcionario) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Query para atualizar um funcionário
            String query = "UPDATE Funcionarios SET nome_completo = ?, cargo = ?, telefone = ? WHERE id_funcionario = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, funcionario.getNomeCompleto());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setInt(4, funcionario.getIdFuncionario());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

    // Método para excluir um funcionário do banco de dados
    public void deleteFuncionario(int id) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Query para excluir um funcionário
            String query = "DELETE FROM Funcionarios WHERE id_funcionario = ?";
            PreparedStatement stmt = connection.prepareStatement(query); 
            stmt.setInt(1, id);
            stmt.executeUpdate(); // Executa a exclusão no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }
}
