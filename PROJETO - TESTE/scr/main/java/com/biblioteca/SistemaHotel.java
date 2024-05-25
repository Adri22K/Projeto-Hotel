class HotelController {
    private HotelController view;

    public HotelController() {
        view = new HotelController();
    }

    public void start() {
        int choice;
        do {
            choice = view.showMenuAndGetChoice();
            switch (choice) {
                case 1:
                    System.out.println("Opção selecionada: Gerenciamento de Hóspedes.");
                    break;
                case 2:
                    System.out.println("Opção selecionada: Gerenciamento de Funcionários.");
                    break;
                case 3:
                    System.out.println("Opção selecionada: Gerenciamento de Reservas.");
                    break;
                case 4:
                    System.out.println("Opção selecionada: Gerenciamento de Quartos da Reserva.");
                    break;
                case 5:
                    System.out.println("Opção selecionada: Gerenciamento de Tipos de Quarto.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção selecionada inválida! Tente novamente.");
            }
        } while (choice != 0);
    }

    private int showMenuAndGetChoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showMenuAndGetChoice'");
    }

    // Métodos para a lógica de negócios correspondente a cada opção do menu
}

public class SistemaHotel {
    public static void main(String[] args) {
        HotelController controller = new HotelController();
        controller.start();
    }

    @Override
    public String toString() {
        return "SistemaHotel []";
    }
}
