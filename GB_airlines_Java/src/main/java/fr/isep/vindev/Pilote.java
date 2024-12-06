package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Pilote extends Employe{
    private String license;
    private Date heureDeVol;
    private boolean isAffecte;

    public Pilote(UUID identifiant, String nom, String adresse, String contact, Date dateEmbauche, int numeroEmploye){
        super(identifiant, nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.license = license;
        this.heureDeVol = heureDeVol;
        this.isAffecte = false;
    }

    @Override
    public String toString() {
        return "[" + this.getNom() + ", licence: " + this.getLicense() + "]";
    }

    public String getLicense(){
        return license;
    }
    public Date getHeureDeVol(){
        return heureDeVol;
    }

    public boolean isAffecte() {
        return isAffecte;
    }

    public void setIsAffecte(boolean affecte) {
        isAffecte = affecte;
    }

    public void affecterVol(Vol vol){
        if (isAffecte) {
            System.out.println("Ce pilote n'est pas disponible");
        }
        else {
            vol.setPilote(this);
            isAffecte = true;
        }
    }

    public static String obtenirVol(int numeroVol, ArrayList<Vol> listeVol){
        for (Vol vol : listeVol){
            if (vol.getNumeroVol() == numeroVol){
                System.out.println(vol.toString());

            }
        }return "";
    }

    public void delete(Pilote pilote){
        pilote = null;
    }
}

