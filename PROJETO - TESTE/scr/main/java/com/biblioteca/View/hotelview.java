package com.library.view;

import com.library.model.Hospede;
import com.library.model.Funcionario;
import com.library.model.Reserva;
import com.library.model.Quarto;
import com.library.model.TipoQuarto;

public class Hospede {
    public void mostarDetalhesHospede(Hospede hospede) {
        System.out.println("Cadastro do Hóspede:");
        System.out.println("Nome Completo: " + hospede.getNomeCompleto());
        System.out.println("Data de Nascimento: " + hospede.getDtNascimento());
        System.out.println("Endereço Completo: " + hospede.getEndereço());
        System.out.println("Telefone: " + hospede.getTelefone());
        System.out.println("Nome Completo: " + hospede.getNomeCompleto());
        System.out.println("Nome Completo: " + hospede.getNomeCompleto());

    }
}

public class Funcionario {
    public void mostarDetalhesFuncionario(Funcionario funcionario) {
        System.out.println("Employee Name: " + funcionario.getName());
        System.out.println("Employee Role: " + funcionario.getRole());
    }
}

public class Reserva {
    public void mostarDetalhesReserva(Reserva reserva) {
        System.out.println("Reservation Start Date: " + reserva.getStartDate());
        System.out.println("Reservation End Date: " + reserva.getEndDate());
    }
}

public class Quarto {
    public void mostarDetalhesQuarto(Quarto quarto) {
        System.out.println("Room Type: " + quarto.getType());
        System.out.println("Room Capacity: " + quarto.getCapacity());
    }
}

public class TipoQuarto {
    public void mostarDetalhesTipoQuarto(TipoQuarto tipoQuarto) {
        System.out.println("Room Type: " + tipoQuarto.getType());
        System.out.println("Room Type Price: " + tipoQuarto.getPrice());
    }
}



