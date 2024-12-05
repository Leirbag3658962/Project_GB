package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class Employe extends Personne {
    protected static int numeroEmploye;
    protected static Date dateEmbauche;



    public Employe(UUID identifiant, String nom, String adresse, String contact, Date dateEmbauche, int numeroEmploye) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = Employe.numeroEmploye;
        this.dateEmbauche = Employe.dateEmbauche;
    }

    public int getNumeroEmploye(){
        return numeroEmploye;
    }
    public Date getDateEmbauche(){
        return dateEmbauche;
    }

    public void obtenirRole(UUID identifiant){

        for (Employe employe : listeEmploye) {
            if (employe.getIdentifiant().equals(identifiant)) {

                if (employe instanceof Pilote){
                    System.out.println("Identifiant: " + identifiant + ", Rôle: Pilote" );

                } else if (employe instanceof PersonnelCabine) {
                    System.out.println("Identifiant: " + identifiant + ", Rôle: Personnel de cabine" );
                }

            }
        }

    }

    //Faire une liste des employés
    public List<Employe> listeEmploye = new ArrayList<>();
    public void ajouterEmployé(Employe employe){
        listeEmploye.add(employe);
    }
}

