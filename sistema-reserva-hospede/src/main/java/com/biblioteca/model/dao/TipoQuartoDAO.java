package com.biblioteca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.config.DatabaseConnection;
import com.biblioteca.model.TipoQuarto;

public class TipoQuartoDAO {

    // Método para obter todos os tipos de quarto do banco de dados
    public List<TipoQuarto> getAllTipoQuartos() {
        List<TipoQuarto> tipoQuartos = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Consulta SQL para selecionar todos os tipos de quarto
            String query = "SELECT * FROM Tipo_Quarto";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Itera sobre o conjunto de resultados e cria objetos TipoQuarto
            while (rs.next()) {
                TipoQuarto tipoQuarto = new TipoQuarto(
                        rs.getInt("id_tipo"),
                        rs.getString("caracteristica"),
                        rs.getString("descricao"),
                        rs.getInt("capacidade"),
                        rs.getDouble("preco_noite")
                );
                tipoQuartos.add(tipoQuarto); // Adiciona os tipos de quarto à lista
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipoQuartos; // Retorna a lista de tipos de quarto
    } 

    // Método para adicionar um novo tipo de quarto ao banco de dados
    public void addTipoQuarto(TipoQuarto tipoQuarto) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para inserir um novo tipo de quarto
            String query = "INSERT INTO Tipo_Quarto (id_tipo, caracteristica, descricao, capacidade, preco_noite) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            // Define os parâmetros do tipo de quarto na declaração SQL
            stmt.setInt(1, tipoQuarto.getIdTipo());
            stmt.setString(2, tipoQuarto.getCaracteristica());
            stmt.setString(3, tipoQuarto.getDescricao());
            stmt.setInt(4, tipoQuarto.getCapacidade());
            stmt.setDouble(5, tipoQuarto.getPrecoNoite());
            stmt.executeUpdate(); // Executa a inserção
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para atualizar um tipo de quarto existente no banco de dados
    public void updateTipoQuarto(TipoQuarto tipoQuarto) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para atualizar um tipo de quarto existente
            String query = "UPDATE Tipo_Quarto SET caracteristica = ?, descricao = ?, capacidade = ?, preco_noite = ? WHERE id_tipo = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            // Define os parâmetros do tipo de quarto na declaração SQL
            stmt.setString(1, tipoQuarto.getCaracteristica());
            stmt.setString(2, tipoQuarto.getDescricao());
            stmt.setInt(3, tipoQuarto.getCapacidade());
            stmt.setDouble(4, tipoQuarto.getPrecoNoite());
            stmt.setInt(5, tipoQuarto.getIdTipo());
            stmt.executeUpdate(); // Executa a atualização
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para excluir um tipo de quarto do banco de dados
    public void deleteTipoQuarto(int idTipo) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para excluir um tipo de quarto pelo ID
            String query = "DELETE FROM Tipo_Quarto WHERE id_tipo = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            // Define o parâmetro ID na declaração SQL
            stmt.setInt(1, idTipo);
            stmt.executeUpdate(); // Executa a exclusão
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
