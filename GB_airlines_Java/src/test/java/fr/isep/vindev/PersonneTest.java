package fr.isep.vindev;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    // Création Vols
    String reservationStr = "01-06-2001 12:00";
    Date reservationDate;

    {
        try {
            reservationDate = formatter.parse(reservationStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    Pilote pilote1 = new Pilote(UUID.randomUUID(),"Robert","Paris 15e","roro@gamil.com",reservationDate,007);
    @Test
    void getNom(){
        assertEquals("Robert",pilote1.getNom() );
    }

}