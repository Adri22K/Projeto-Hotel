package model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DatabaseConnection;

import model.Quarto;

public class QuartoDAO {
    public List<Quarto> getAllQuartos(Object ResultSetrs) {
        List<Quarto> quartos = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Quarto";
            PreparedStatement stmt = connection.prepareStatement(query);
            catch  (ResultSet rs)
        }
    }
}