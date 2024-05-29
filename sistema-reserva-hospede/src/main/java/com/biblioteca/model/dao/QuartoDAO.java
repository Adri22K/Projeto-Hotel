package com.biblioteca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.config.DatabaseConnection;
import com.biblioteca.model.Quarto;

public class QuartoDAO {

    // Método para recuperar todos os quartos do banco de dados

    public List<Quarto> getAllQuartos() {
        List<Quarto> quartos = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Quarto"; // Query para selecionar todos os quartos
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Loop para iterar sobre o resultado e criar objetos Quarto
            while (rs.next()) {
                Quarto quarto = new Quarto(
                        rs.getInt("id_quarto"),
                        rs.getInt("num_quarto"),
                        rs.getString("tipo"),
                        rs.getInt("preco"),
                        rs.getInt("id_tipo")
                );
                quartos.add(quarto); // Adiciona o objeto Quarto à lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
        return quartos; // Retorna a lista de quartos recuperados do banco de dados
    }

    // Método para adicionar um novo quarto ao banco de dados
    public void addQuarto(Quarto quarto) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Quarto (id_quarto, num_quarto, tipo, preco, id_tipo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, quarto.getIdQuarto());
            stmt.setInt(2, quarto.getNumQuarto());
            stmt.setString(3, quarto.getTipo());
            stmt.setDouble(4, quarto.getPreco());
            stmt.setInt(5, quarto.getIdTipo());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

    // Método para atualizar um quarto existente no banco de dados
    public void updateQuarto(Quarto quarto) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "UPDATE Quarto SET num_quarto = ?, tipo = ?, preco = ?, id_tipo = ? WHERE id_quarto = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, quarto.getNumQuarto());
            stmt.setString(2, quarto.getTipo());
            stmt.setDouble(3, quarto.getPreco());
            stmt.setInt(4, quarto.getIdTipo());
            stmt.setInt(5, quarto.getIdQuarto());
            stmt.executeUpdate(); // Executa a atualização no banco de dados
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime qualquer exceção SQL que ocorra
        }
    }

    // Método para excluir um quarto do banco de dados
    public void deleteQuarto(int id) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM Quarto WHERE id_quarto = ?"; // Query para excluir um quarto
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate(); // Executa a exclusão no banco de dados
        } catch (SQLException e) {
            e.printStackTrace();} // Imprime qualquer exceção SQL que ocorra
        }
}
