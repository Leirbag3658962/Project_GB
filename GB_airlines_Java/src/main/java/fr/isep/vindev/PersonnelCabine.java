package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class PersonnelCabine extends Employe{
    private String qualification;
    private boolean isAffecte;

    public PersonnelCabine(UUID identifiant, String nom, String adresse, String contact, Date dateEmbauche,
                           int numeroEmploye, String qualification) {
        super(identifiant, nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.qualification = qualification;
        this.isAffecte = false;
    }

    public boolean isAffecte() {
        return isAffecte;
    }

    public void setIsAffecte(boolean affecte) {
        isAffecte = affecte;
    }

    public String getQualification(){
        return qualification;
    }

    public void affecterVol(Vol vol){
        if (isAffecte) {
            System.out.println("Ce pilote n'est pas disponible");
        }
        else {
            vol.getEquipage().add(this);
            vol.setEquipage(vol.getEquipage());
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
}

