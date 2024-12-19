package fr.isep.vindev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean isAffecte;
    private static ArrayList<Avion> listeAvions = new ArrayList<Avion>();

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.isAffecte = false;
    }


    public static void importAvion() {
        String filePath = "src/avionCSV.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    try {
                        String immatriculation = parts[0];
                        String modele = parts[1];
                        int capacite = Integer.parseInt(parts[2]);
                        Avion avion = new Avion(immatriculation, modele, capacite);
                        listeAvions.add(avion);
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur de conversion sur cette ligne : " + line);
                    }
                } else {
                    System.out.println("Ligne mal formée, ignorée : " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        System.out.println("Importation terminée. Nombre d'avions importés : " + listeAvions.size());
        for (Avion avion : listeAvions) {
            System.out.println(avion);
        }
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isAffecte() {
        return isAffecte;
    }

    public void setIsAffecte(boolean Affecte) {
        isAffecte = Affecte;
    }

    @Override
    public String toString() {
        return "Avion [Immatriculation:" + immatriculation + ", modele:" + modele + ", capacite:" + capacite + "]";
    }

    public void affecterVol(Vol vol){
        if(isAffecte){
            System.out.println("Erreur: cet avion est deja affecte");
        }
        else {
            vol.setAvion(this);
            vol.setIsAvionAffecte(true);
            isAffecte = true;
        }
    }

    public void verifierDisponibilite(){
        if(isAffecte){
            System.out.println("Cet avion n'est pas disponible");
        }
        else {
            System.out.println("Cet avion est disponible");
        }
    }

    public void delete(Avion avion){
        avion = null;
    }

}
