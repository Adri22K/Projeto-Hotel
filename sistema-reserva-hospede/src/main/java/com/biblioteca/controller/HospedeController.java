package com.biblioteca.controller;

import java.util.List;

import com.biblioteca.model.Hospede;
import com.biblioteca.model.dao.HospedeDAO;

// Controlador para operações relacionadas a hospede
public class HospedeController {
    private HospedeDAO hospedeDAO;

    // Construtor que realiza a injeção de dependência de HospedeDAO
    public HospedeController() {
        hospedeDAO = new HospedeDAO(); // Instancia um objeto HospedeDAO para interação com o banco de dados
    }

    // Método para adicionar um hospede
    // Recebe um objeto Hospede como parâmetro
    public void addHospede(Hospede hospede) {
        hospedeDAO.addHospede(hospede);
    }

    // Método para recuperar todos os hospede
    // Retorna uma lista de hospede
    public List<Hospede> getAllHospedes() {
        return hospedeDAO.getAllHospedes();
    }

    // Método para atualizar um hospede
    // Recebe um objeto Hospede como parâmetro
    public void updateHospede(Hospede hospede) {
        hospedeDAO.updateHospede(hospede);
    }

    // Método para deletar um hospede
    // Recebe o ID do hospede a ser deletado como parâmetro
    public void deleteHospede(int idHospedes) {
        hospedeDAO.deleteHospede(idHospedes);
    }
}
