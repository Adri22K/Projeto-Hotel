package com.library.view;

import com.library.model.Hospede;
import com.library.model.Funcionario;
import com.library.model.Reserva;
import com.library.model.Quarto;
import com.library.model.TipoQuarto;

public class GuestView {
    public void printGuestDetails(Guest guest) {
        System.out.println("Guest Name: " + guest.getName());
        System.out.println("Guest Email: " + guest.getEmail());
    }
}

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Role: " + employee.getRole());
    }
}

public class ReservationView {
    public void printReservationDetails(Reservation reservation) {
        System.out.println("Reservation Start Date: " + reservation.getStartDate());
        System.out.println("Reservation End Date: " + reservation.getEndDate());
    }
}

public class RoomView {
    public void printRoomDetails(Room room) {
        System.out.println("Room Type: " + room.getType());
        System.out.println("Room Capacity: " + room.getCapacity());
    }
}

public class RoomTypeView {
    public void printRoomTypeDetails(RoomType roomType) {
        System.out.println("Room Type: " + roomType.getType());
        System.out.println("Room Type Price: " + roomType.getPrice());
    }
}

