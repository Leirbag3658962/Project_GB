package fr.isep.vindev;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
class AeroportTest {
    Aeroport orly = new Aeroport("Orly","Paris","Très grand!");

    @Test
    void getNom() {
        assertEquals("Orly",orly.getNom());
    }

    @Test
    void getVille() {
        assertEquals("Paris",orly.getVille());
    }
}