package com.biblioteca.view;

import java.util.List;
import java.util.Scanner;

import com.biblioteca.controller.FuncionarioController;
import com.biblioteca.model.Funcionario;

public class FuncionarioView {
    private FuncionarioController funcionarioController; // Controlador para manipulação de funcionários
    private Scanner scanner; // Scanner para entrada de dados do usuário

    // Construtor da classe FuncionarioView
    public FuncionarioView() {
        funcionarioController = new FuncionarioController();
        scanner = new Scanner(System.in); 
    }

    // Método para exibir todos os funcionários
    public void displayAllFuncionarios() {

        // Obtém a lista de funcionários do controlador
        List<Funcionario> funcionarios = funcionarioController.getAllFuncionarios();

        // Loop para iterar sobre cada funcionário na lista
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getIdFuncionario());
            System.out.println("Nome: " + funcionario.getNomeCompleto());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("-----------------------------");
        }
    }

    // Método para adicionar um novo funcionário
    public void addFuncionario() {
        System.out.println("Digite o ID do funcionário:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Digite o cargo:");
        String cargo = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        // Cria um novo objeto Funcionario com os detalhes fornecidos
        Funcionario funcionario = new Funcionario(id, nome, cargo, telefone);
        funcionarioController.addFuncionario(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Método para atualizar os detalhes de um funcionário existente
    public void updateFuncionario() {
        System.out.println("Digite o ID do funcionário a ser atualizado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o novo nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Digite o novo cargo:");
        String cargo = scanner.nextLine();
        System.out.println("Digite o novo telefone:");
        String telefone = scanner.nextLine();
    
        // Cria um novo objeto Funcionario com os novos detalhes
        Funcionario funcionario = new Funcionario(id, nome, cargo, telefone);
        funcionarioController.updateFuncionario(funcionario);
        System.out.println("Funcionário atualizado com sucesso!");
    }

    // Método para excluir um funcionário
    public void deleteFuncionario() {

        // Solicita ao usuário o ID do funcionário a ser excluído
        System.out.println("Digite o ID do funcionário a ser deletado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        funcionarioController.deleteFuncionario(id); // Exclui o funcionário usando o controlador
        System.out.println("Funcionário deletado");
        }
     
    
}