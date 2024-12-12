package fr.isep.vindev;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    ArrayList<Reservation> listeReservation = new ArrayList<Reservation>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    // Création Vols
    String reservationStr = "01-01-2024 08:00";
    Date reservationDate;

    {
        try {
            reservationDate = formatter.parse(reservationStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    UUID idreservation = UUID.randomUUID();
    Reservation reservation1 = new Reservation(idreservation,reservationDate, "En cours de création...");

    @Test
    void getNumeroReservation() {
        assertEquals(idreservation,reservation1.getNumeroReservation());
    }
    
}