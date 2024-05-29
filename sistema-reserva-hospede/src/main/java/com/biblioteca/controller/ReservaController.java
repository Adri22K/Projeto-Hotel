package com.biblioteca.controller;

import java.util.List;

import com.biblioteca.model.Reserva;
import com.biblioteca.model.dao.ReservaDAO;

// Controlador para operações relacionadas a reserva
public class ReservaController {
    private ReservaDAO reservaDAO;

    // Construtor que realiza a injeção de dependência de ReservaDAO
    public ReservaController() {
        reservaDAO = new ReservaDAO(); // Instancia um objeto ReservaDAO para interação com o banco de dados
    }

    // Método para recuperar todos as reservas
    // Retorna uma lista de reservas
    public List<Reserva> getAllReservas() {
        return reservaDAO.getAllReservas();
    }

    // Método para adicionar uma reserva
    // Recebe um objeto Reserva como parâmetro
    public void addReserva(Reserva reserva) {
        reservaDAO.addReserva(reserva);
    }

    // Método para atualizar uma reserva
    // Recebe um objeto Reserva como parâmetro
    public void updateReserva(Reserva reserva) {
        reservaDAO.updateReserva(reserva);
    }

    // Método para deletar uma reserva
    // Recebe o ID da reserva a ser deletado como parâmetro
    public void deleteReserva(int id) {
        reservaDAO.deleteReserva(id);
    }
}
