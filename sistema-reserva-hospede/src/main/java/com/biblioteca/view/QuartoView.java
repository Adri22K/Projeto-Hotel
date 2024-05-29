package com.biblioteca.view;

import java.util.List;
import java.util.Scanner;

import com.biblioteca.controller.QuartoController;
import com.biblioteca.model.Quarto;

public class QuartoView {
    private QuartoController quartoController;
    private Scanner scanner;

    public QuartoView() {
        // Inicialização do controlador de quartos e do scanner
        quartoController = new QuartoController();
        scanner = new Scanner(System.in);
    }

    public void displayAllQuartos() {
        
        // Obtém a lista de quartos do controlador
        List<Quarto> quartos = quartoController.getAllQuartos();

        // Exibe os detalhes de cada quarto na lista
        for (Quarto quarto : quartos) {
            System.out.println("ID: " + quarto.getIdQuarto());
            System.out.println("Número: " + quarto.getNumQuarto());
            System.out.println("Tipo: " + quarto.getTipo());
            System.out.println("Preço: " + quarto.getPreco());
            System.out.println("ID Tipo: " + quarto.getIdTipo());
            System.out.println("-----------------------------");
        }
    }

    public void addQuarto() {

        // Solicita ao usuário os detalhes do novo quarto e adiciona ao controlador
        System.out.println("Digite o ID do quarto:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número do quarto:");
        int numQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o tipo de quarto:");
        String tipo = scanner.nextLine();
        System.out.println("Digite o preço do quarto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o ID do tipo:");
        int idTipo = scanner.nextInt();

        Quarto quarto = new Quarto(id, numQuarto, tipo, preco, idTipo);
        quartoController.addQuarto(quarto);
        System.out.println("Quarto adicionado com sucesso!");
    }

    public void updateQuarto() {

         // Solicita ao usuário o ID do quarto a ser atualizado e os novos detalhes
        System.out.println("Digite o ID do quarto a ser atualizado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o novo número do quarto:");
        int numQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o novo tipo de quarto:");
        String tipo = scanner.nextLine();
        System.out.println("Digite o novo preço do quarto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o novo ID do tipo:");
        int idTipo = scanner.nextInt();

        Quarto quarto = new Quarto(id, numQuarto, tipo, preco, idTipo);
        quartoController.updateQuarto(quarto);
        System.out.println("Quarto atualizado com sucesso!");
    }

    public void deleteQuarto() {

        // Solicita ao usuário o ID do quarto a ser deletado e remove do controlador
        System.out.println("Digite o ID do quarto a ser deletado:");
        int id = scanner.nextInt();
        scanner.nextLine();
        quartoController.deleteQuarto(id);
        System.out.println("Quarto deletado com sucesso!");
    }
}
