package com.biblioteca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.config.DatabaseConnection;
import com.biblioteca.model.Hospede;

// Classe responsável por acessar e manipular dados relacionados aos hóspedes no banco de dados
public class HospedeDAO {

    // Método para recuperar todos os hóspedes do banco de dados
    public List<Hospede> getAllHospedes() {
        List<Hospede> hospedes = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Hospedes"; // Query para selecionar todos os hóspedes
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Loop para iterar sobre o resultado e criar objetos Hospede
            while (rs.next()) {
                Hospede hospede = new Hospede(
                        rs.getInt("id_hospedes"),
                        rs.getString("nome_completo"),
                        rs.getDate("dt_nascimento"),
                        rs.getString("endereco"),
                        rs.getString("telefone"),
                        rs.getString("email"),
                        rs.getString("cpf")
                );
                hospedes.add(hospede); // Adiciona o objeto Hospede à lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
        return hospedes; // Retorna a lista de hóspedes recuperados do banco de dados
    }

    // Método para adicionar um novo hóspede ao banco de dados
    public void addHospede(Hospede hospede) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Query para inserir um novo hóspede
            String query = "INSERT INTO Hospedes (id_hospedes, nome_completo, dt_nascimento, endereco, telefone, email, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, hospede.getIdHospedes());
            stmt.setString(2, hospede.getNomeCompleto());
            stmt.setDate(3, new java.sql.Date(hospede.getDtNascimento().getTime()));
            stmt.setString(4, hospede.getEndereco());
            stmt.setString(5, hospede.getTelefone());
            stmt.setString(6, hospede.getEmail());
            stmt.setString(7, hospede.getCpf());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

    // Método para atualizar as informações de um hóspede existente no banco de dados
    public void updateHospede(Hospede hospede) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Query para atualizar um hóspede
            String query = "UPDATE Hospedes SET nome_completo = ?, dt_nascimento = ?, endereco = ?, telefone = ?, email = ?, cpf = ? WHERE id_hospedes = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, hospede.getNomeCompleto());
            stmt.setDate(2, new java.sql.Date(hospede.getDtNascimento().getTime()));
            stmt.setString(3, hospede.getEndereco());
            stmt.setString(4, hospede.getTelefone());
            stmt.setString(5, hospede.getEmail());
            stmt.setString(6, hospede.getCpf());
            stmt.setInt(7, hospede.getIdHospedes());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

     // Método para excluir um hóspede do banco de dados
    public void deleteHospede(int id) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM Hospedes WHERE id_hospedes = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate(); // Executa a exclusão no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }
}
