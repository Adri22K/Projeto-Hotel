package com.biblioteca.controller;

import java.util.List;

import com.biblioteca.model.TipoQuarto;
import com.biblioteca.model.dao.TipoQuartoDAO;

// Controlador para operações relacionadas a tipo quartos
public class TipoQuartoController {
    private TipoQuartoDAO tipoQuartoDAO;

// Construtor que realiza a injeção de dependência de TipoQuartoDAO
    public TipoQuartoController() {
        tipoQuartoDAO = new TipoQuartoDAO(); // Instancia um objeto TipoQuartoDAO para interação com o banco de dados
    }

    // Método para recuperar todos os tipos de quartos
    // Retorna uma lista de tipos de quartos
    public List<TipoQuarto> getAllTipoQuartos() {
        return tipoQuartoDAO.getAllTipoQuartos();
    }

    // Método para adicionar um tipo de quarto
    // Recebe um objeto TipoQuarto como parâmetro
    public void addTipoQuarto(TipoQuarto tipoQuarto) {
        tipoQuartoDAO.addTipoQuarto(tipoQuarto);
    }

    // Método para atualizar um tipo de quarto
    // Recebe um objeto TipoQuarto como parâmetro
    public void updateTipoQuarto(TipoQuarto tipoQuarto) {
        tipoQuartoDAO.updateTipoQuarto(tipoQuarto);
    }

    // Método para deletar um tipo de quarto
    // Recebe o ID do tipo dequarto a ser deletado como parâmetro
    public void deleteTipoQuarto(int id) {
        tipoQuartoDAO.deleteTipoQuarto(id);
    }
}
