import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {
        DatabaseManager.createTables();
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========  Sistema de Gerenciamento do Hotel ======== ");
            System.out.println("1. Gerenciamento de Hóspedes");
            System.out.println("2. Gerenciamento de Funcionários");
            System.out.println("3. Gerenciamento de Reservas");
            System.out.println("4. Gerenciamento de Quartos da Reserva");
            System.out.println("5. Gerenciamento de Tipos de Quarto");
            System.out.println("0. Sair");
            System.out.println("======== Escolha uma opção: ========");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HospedeManager.manage();
                    break;
                case 2:
                    FuncionarioManager.manage();
                    break;
                case 3:
                    ReservaManager.manage();
                    break;
                case 4:
                    QuartoManager.manage();
                    break;
                case 5:
                    TipoQuartoManager.manage();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção selecionada inválida! Tente novamente.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
