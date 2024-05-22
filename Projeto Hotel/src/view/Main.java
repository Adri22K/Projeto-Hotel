package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservaView reservaView = new ReservaView();
        FuncionarioView funcionarioView = new FuncionarioView();
        QuartoView quartoView = new QuartoView();
        HospedeView hospedeView = new HospedeView();

        while (true) {
            System.out.println("Sistema de Gestão do Hotel");
            System.out.println("1. Gerenciar Reservas");
            System.out.println("2. Gerenciar Funcionários");
            System.out.println("3. Gerenciar Quartos");
            System.out.println("4. Gerenciar Hóspedes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciarReservas(reservaView, scanner);
                    break;
                case 2:
                    gerenciarFuncionarios(funcionarioView, scanner);
                    break;
                case 3:
                    gerenciarQuartos(quartoView, scanner);
                    break;
                case 4:
                    gerenciarHospedes(hospedeView, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarReservas(ReservaView reservaView, Scanner scanner) {
        while (true) {
            System.out.println("Gerenciar Reservas");
            System.out.println("1. Exibir todas as reservas");
            System.out.println("2. Adicionar reserva");
            System.out.println("3. Atualizar reserva");
            System.out.println("4. Deletar reserva");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reservaView.displayAllReservas();
                    break;
                case 2:
                    reservaView.addReserva();
                    break;
                case 3:
                    reservaView.updateReserva();
                    break;
                case 4:
                    reservaView.deleteReserva();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarFuncionarios(FuncionarioView funcionarioView, Scanner scanner) {
        while (true) {
            System.out.println("Gerenciar Funcionários");
            System.out.println("1. Exibir todos os funcionários");
            System.out.println("2. Adicionar funcionário");
            System.out.println("3. Atualizar funcionário");
            System.out.println("4. Deletar funcionário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    funcionarioView.displayAllFuncionarios();
                    break;
                case 2:
                    funcionarioView.addFuncionario();
                    break;
                case 3:
                    funcionarioView.updateFuncionario();
                    break;
                case 4:
                    funcionarioView.deleteFuncionario();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarQuartos(QuartoView quartoView, Scanner scanner) {
        while (true) {
            System.out.println("Gerenciar Quartos");
            System.out.println("1. Exibir todos os quartos");
            System.out.println("2. Adicionar quarto");
            System.out.println("3. Atualizar quarto");
            System.out.println("4. Deletar quarto");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    quartoView.displayAllQuartos();
                    break;
                case 2:
                    quartoView.addQuarto();
                    break;
                case 3:
                    quartoView.updateQuarto();
                    break;
                case 4:
                    quartoView.deleteQuarto();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerenciarHospedes(HospedeView hospedeView, Scanner scanner) {
        while (true) {
            System.out.println("Gerenciar Hóspedes");
            System.out.println("1. Exibir todos os hóspedes");
            System.out.println("2. Adicionar hóspede");
            System.out.println("3. Atualizar hóspede");
            System.out.println("4. Deletar hóspede");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    hospedeView.displayAllHospedes();
                    break;
                case 2:
                    hospedeView.addHospede();
                    break;
                case 3:
                    hospedeView.updateHospede();
                    break;
                case 4:
                    hospedeView.deleteHospede();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}