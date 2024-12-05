package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Pilote extends Employe{
    private String license;
    private Date heureDeVol;

    public Pilote(UUID identifiant, String nom, String adresse, String contact, Date dateEmbauche, int numeroEmploye){
        super(identifiant, nom, adresse, contact, dateEmbauche, numeroEmploye);
        this.license = license;
        this.heureDeVol = heureDeVol;
    }

    public String getLicense(){
        return license;
    }
    public Date getHeureDeVol(){
        return heureDeVol;
    }

    public void affecterVol(Vol vol, Pilote pilote){
        vol.equipage.add(pilote);
    }
}

