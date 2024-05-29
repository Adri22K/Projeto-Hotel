package com.biblioteca.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.config.DatabaseConnection;
import com.biblioteca.model.Reserva;

public class ReservaDAO {

    // Método para obter todas as reservas do banco de dados
    public List<Reserva> getAllReservas() {
        List<Reserva> reservas = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Consulta SQL para selecionar todas as reservas
            String query = "SELECT * FROM Reservas";
            try (PreparedStatement stmt = connection.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Reserva reserva = new Reserva(
                            rs.getInt("id_reservas"),
                            rs.getDate("data_checkin"),
                            rs.getDate("data_checkout"),
                            rs.getString("status"),
                            rs.getInt("id_hospedes"),
                            rs.getInt("id_funcionario"),
                            rs.getInt("id_quarto") 
                            
                    );
                    reservas.add(reserva); // Adiciona as reservas à lista
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return reservas; // Retorna a lista de reservas
    }


    // Método para adicionar uma reserva ao banco de dados
    public void addReserva(Reserva reserva) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para inserir uma nova reserva
            String query = "INSERT INTO Reservas (data_checkin, data_checkout, status, id_hospedes, id_funcionario, id_quarto) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                // Define os parâmetros da reserva na declaração SQL
                stmt.setDate(1, java.sql.Date.valueOf(reserva.getDataInicio()));
                stmt.setDate(2, java.sql.Date.valueOf(reserva.getDataFim()));
                stmt.setString(3, reserva.getStatus());
                stmt.setInt(4, reserva.getIdHospedes());
                stmt.setInt(5, reserva.getIdFuncionario());
                stmt.setInt(6, reserva.getIdQuarto());
                stmt.executeUpdate(); // Executa a inserção
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    

    // Método para atualizar uma reserva no banco de dados
    public void updateReserva(Reserva reserva) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para atualizar uma reserva existente
            String query = "UPDATE Reservas SET data_checkin = ?, data_checkout = ?, status = ?, id_hospedes = ?, id_funcionario = ?, id_quarto = ? WHERE id_reservas = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                // Define os parâmetros da reserva na declaração SQL
                stmt.setDate(1, java.sql.Date.valueOf(reserva.getDataInicio()));
                stmt.setDate(2, java.sql.Date.valueOf(reserva.getDataFim()));
                stmt.setString(3, reserva.getStatus());
                stmt.setInt(4, reserva.getIdHospedes());
                stmt.setInt(5, reserva.getIdFuncionario());
                stmt.setInt(6, reserva.getIdQuarto());
                stmt.setInt(7, reserva.getIdReservas());
                stmt.executeUpdate(); // Executa a atualização
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para excluir uma reserva do banco de dados
    public void deleteReserva(int id) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Declaração SQL para excluir uma reserva pelo ID
            String query = "DELETE FROM Reservas WHERE id_reservas = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                // Define o parâmetro ID na declaração SQL
                stmt.setInt(1, id);
                stmt.executeUpdate(); // Executa a exclusão
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
