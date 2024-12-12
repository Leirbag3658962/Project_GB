package fr.isep.hal;
import fr.isep.vindev.Passager;
import fr.isep.vindev.Reservation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EcrireCSV {
    private static List<Passager> listePourEcrire = new ArrayList<Passager>();

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Benoi\\Documents\\_Java\\Reservation.txt";
        Passager passager1 = new Passager(UUID.randomUUID(),"Develter","75 rue de Vaugirard","fantom@gmail.com","Valide");
        listePourEcrire.add(passager1);
        Passager passager2 = new Passager(UUID.randomUUID(),"Vincent","Looooooooooin","Leirbag@gmail.com","Valide");
        listePourEcrire.add(passager2);
        Passager passager3 = new Passager(UUID.randomUUID(),"Lemaire","jesaispasoù","cki@gmail.com","Valide");
        listePourEcrire.add(passager3);

        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter(filePath, true))) // `true` pour ajouter à la fin
        {
            for (Passager passager : listePourEcrire) {
                writer.newLine(); // Ajoute une nouvelle ligne
                writer.write(passager.toString());
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " +
                    e.getMessage());
        }
    }
}
