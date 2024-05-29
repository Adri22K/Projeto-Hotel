package com.biblioteca.controller;

import java.util.List;

import com.biblioteca.model.Quarto;
import com.biblioteca.model.dao.QuartoDAO;

// Controlador para operações relacionadas a quartos
public class QuartoController {
    private QuartoDAO quartoDAO;

    // Construtor que realiza a injeção de dependência de QuartoDAO
    public QuartoController() {
        quartoDAO = new QuartoDAO(); // Instancia um objeto QuartoDAO para interação com o banco de dados
    }

    // Método para recuperar todos os quartos
    // Retorna uma lista de quartos
    public List<Quarto> getAllQuartos() {
        return quartoDAO.getAllQuartos();
    }

    // Método para adicionar um quarto
    // Recebe um objeto Quarto como parâmetro
    public void addQuarto(Quarto quarto) {
        quartoDAO.addQuarto(quarto);
    }

    // Método para atualizar um quarto
    // Recebe um objeto Quarto como parâmetro
    public void updateQuarto(Quarto quarto) {
        quartoDAO.updateQuarto(quarto); 
    }

    // Método para deletar um quarto
    // Recebe o ID do quarto a ser deletado como parâmetro
    public void deleteQuarto(int id) {
        quartoDAO.deleteQuarto(id);
    }
}
