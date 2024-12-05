package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class PersonnelCabine extends Employe{
    private String qualification;

    public PersonnelCabine(UUID identifiant, String nom, String adresse, String contact, Date dateEmbauche,
                           int numeroEmploye, String qualification) {
        super(identifiant, nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.qualification = qualification;
    }

    public String getQualification(){
        return qualification;
    }

    public static void affecterVol(Vol vol, PersonnelCabine personnel){
        vol.equipage.add(personnel);
    }

    public static String obtenirVol(int numeroVol, ArrayList<Vol> listeVol){
        for (Vol vol : listeVol){
            if (vol.getNumeroVol() == numeroVol){
                System.out.println(vol.toString());
            }
        }return "";
    }
}

