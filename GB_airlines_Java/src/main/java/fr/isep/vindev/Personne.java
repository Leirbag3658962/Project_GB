package fr.isep.vindev;

import java.util.UUID;

public abstract class Personne {
    private UUID identifiant;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(UUID identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public UUID getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static String obtenirInfos(Personne personne){
        System.out.println("Nom: " + personne.getNom() + ", Adresse: " + personne.getAdresse() + ", Contact: " + personne.getContact());
        return "";
    }
}

