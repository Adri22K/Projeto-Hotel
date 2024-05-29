package com.biblioteca.view;

import java.util.List;
import java.util.Scanner;

import com.biblioteca.controller.HospedeController;
import com.biblioteca.model.Hospede;

public class HospedeView {
    private HospedeController hospedeController; // Controlador para manipulação de hóspedes
    private Scanner scanner; // Scanner para entrada de dados do usuário

    // Construtor da classe HospedeView
    public HospedeView() {
        hospedeController = new HospedeController();
        scanner = new Scanner(System.in);
    }

    // Método para exibir todos os hóspedes
    public void displayAllHospedes() {

         // Obtém a lista de hóspedes do controlador
        List<Hospede> hospedes = hospedeController.getAllHospedes();

        // Loop para iterar sobre cada hóspede na lista
        for (Hospede hospede : hospedes) {
            System.out.println("ID: " + hospede.getIdHospedes());
            System.out.println("Nome: " + hospede.getNomeCompleto());
            System.out.println("Data de Nascimento: " + hospede.getDtNascimento());
            System.out.println("Endereço: " + hospede.getEndereco());
            System.out.println("Telefone: " + hospede.getTelefone());
            System.out.println("Email: " + hospede.getEmail());
            System.out.println("CPF: " + hospede.getCpf());
            System.out.println("-----------------------------");
        }
    }

    // Método para adicionar um novo hóspede
    public void addHospede() {
        System.out.println("Digite o ID do hóspede:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (yyyy-mm-dd):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        // Cria um novo objeto Hospede com os detalhes fornecidos
        Hospede hospede = new Hospede(id, nome, java.sql.Date.valueOf(dataNascimento), endereco, telefone, email, cpf);
        hospedeController.addHospede(hospede); // Adiciona o hóspede usando o controlador
        System.out.println("Hóspede adicionado com sucesso!");
    }

    // Método para atualizar os detalhes de um hóspede existente
    public void updateHospede() {
        System.out.println("Digite o ID do hóspede a ser atualizado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o novo nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Digite a nova data de nascimento (yyyy-mm-dd):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o novo endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o novo telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o novo email:");
        String email = scanner.nextLine();
        System.out.println("Digite o novo CPF:");
        String cpf = scanner.nextLine();

        // Cria um novo objeto Hospede com os novos detalhes
        Hospede hospede = new Hospede(id, nome, java.sql.Date.valueOf(dataNascimento), endereco, telefone, email, cpf);
        hospedeController.updateHospede(hospede);
        System.out.println("Hóspede atualizado com sucesso!");
    }

    // Método para excluir um hóspede
    public void deleteHospede() {
        System.out.println("Digite o ID do hóspede a ser deletado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        hospedeController.deleteHospede(id);
        System.out.println("Hóspede deletado com sucesso!");
    }
}
