package fr.isep.vindev;

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
}

