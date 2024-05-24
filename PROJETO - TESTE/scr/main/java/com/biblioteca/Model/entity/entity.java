public class Hospede {
    private int id;
    private String nomeCompleto;
    private int dtNascimento;
    private String endereço;
    private String telefone;
    private String email;    
    private String cpf;
}

public class Funcionario {
    private int id;
    private String nomeCompleto;
    private String cargo;
    private String telefone;
    private Reserva Reserva;


}

public class TipoQuarto {
    private int id;
    private String caracteristica;
    private String descrição;
    private int capacidade;
    private float preçoNoite;

}

public class Reserva{
    private int id;
    private String status;
    private Hospede Hospede;
    private Funcinario Funcinario;
    private Quarto Quarto;
    private int dataCheckin ;
    private int dataCheckout ;

}

public class Quarto {
    private int id;
    private int numQuarto;
    private String tipo;
    private float preço;
    private TipoQuarto TipoQuarto;
}
