package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Scanner;

public class Vol {
    private int numeroVol;
    private Avion avion;
    private ArrayList<Passager> passager;
    public static ArrayList<Vol> listeVol = new ArrayList<>();
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Aeroport aeroportDebutAffecte;
    private Aeroport aeroportArriveeAffecte;
    private Pilote pilote;
    public ArrayList<PersonnelCabine> equipage;
    private boolean isAvionAffecte;
    private boolean isAeroportDebutAffecte;
    private boolean isAeroportArriveeAffecte;
    private boolean isPiloteAffecte;
    private boolean isEquipageAffecte;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.isEquipageAffecte = false;
        this.isAeroportDebutAffecte = false;
        this.isAeroportArriveeAffecte = false;
        this.isAvionAffecte = false;
        this.equipage = new ArrayList<PersonnelCabine>();
        this.etat = "Incomplete";
    }

    // <editor-fold desc="Getter and setter">
    public ArrayList<PersonnelCabine> getEquipage(){
        return equipage;
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String isEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        if (etat == "Prevu" && isAvionAffecte && isAeroportDebutAffecte && isAeroportArriveeAffecte && isPiloteAffecte && isEquipageAffecte) {
            this.etat = etat;
        }
        else if (etat == "Annule"){
            this.avion.setIsAffecte(false);
            this.pilote.setIsAffecte(false);
            this.etat = etat;
        }
        else if (etat == "Retarde" && this.etat=="Prevu"){
            System.out.println("De combien de temps le vol est-il retarde en min?");
            Scanner retard = new Scanner(System.in);
            this.etat = etat;
            this.dateHeureDepart = dateHeureDepart + "retarde de " + retard + "min";
        }
        else {
            System.out.println("Erreur : etat non valide");
            System.out.println("Choisissez entre 'Prevu', 'Annule', 'Retarde'");
        }
    }

    public ArrayList<Passager> getPassager() {
        return passager;
    }

    public Aeroport getAeroportDebutAffecte() {
        return aeroportDebutAffecte;
    }

    public void setAeroportDebutAffecte(Aeroport aeroportDebutAffecte) {
        this.aeroportDebutAffecte = aeroportDebutAffecte;
    }

    public void setAeroportArriveeAffecte(Aeroport aeroportArriveeAffecte) {
        this.aeroportArriveeAffecte = aeroportArriveeAffecte;
    }

    public void setIsAvionAffecte(boolean isAvionAffecte) {
        isAvionAffecte = isAvionAffecte;
    }

    public void setIsAeroportDebutAffecte(boolean isAeroportDebutAffecte) {
        isAeroportDebutAffecte = isAeroportDebutAffecte;
    }

    public void setIsAeroportArriveeAffecte(boolean isAeroportArriveeAffecte) {
        isAeroportArriveeAffecte = isAeroportArriveeAffecte;
    }

    public void setIsEquipageAffecte(boolean isEquipageAffecte) {
        isEquipageAffecte = isEquipageAffecte;
    }

    public void setEquipage(ArrayList<PersonnelCabine> equipage) {
        this.equipage = equipage;
    }

    public Aeroport getAeroportArriveeAffecte() {
        return aeroportArriveeAffecte;
    }

    public boolean isAvionAffecte() {
        return isAvionAffecte;
    }

    public boolean isAeroportDebutAffecte() {
        return isAeroportDebutAffecte;
    }

    public boolean isAeroportArriveeAffecte() {
        return isAeroportArriveeAffecte;
    }

    public boolean isEquipageAffecte() {
        return isEquipageAffecte;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public void setEquipageAffecte(boolean equipageAffecte) {
        isEquipageAffecte = equipageAffecte;
    }

    public boolean isPiloteAffecte() {
        return isPiloteAffecte;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    // </editor-fold>

    @Override
    public String toString() {
        return "Vol [numero: " + numeroVol + ", avion: " + avion + ", depart: " + origine + " a l'aeroport de " + aeroportDebutAffecte + ", arrivee: " + destination + " a l'aeroport de " + aeroportArriveeAffecte + ", heure de depart: " + dateHeureDepart + ", heure d'arrivee: " + dateHeureArrivee + ", etat: " + etat + ", Liste des employés: " + equipage + ", pilote: " + pilote + "]";
    }

    public void planifierVol(){
        for (int i=0; i< listeVol.size(); i++){
            System.out.println(listeVol.get(i));
        }
    }

    public void annulerVol(){
        this.setEtat("Annule");
    }

    public void modifierVol(Avion avion, String origine, String destination, Aeroport aeroportDepart, Aeroport aeroportArrivee, Pilote pilote, ArrayList<PersonnelCabine> equipage, String etat) {
        if (avion != null) {
            this.setAvion(avion);
        }
        if (origine != null) {
            this.setOrigine(origine);
        }
        if (destination != null) {
            this.setDestination(destination);
        }
        if (aeroportDepart != null) {
            this.setAeroportDebutAffecte(aeroportDepart);
        }
        if (aeroportArrivee != null) {
            this.setAeroportArriveeAffecte(aeroportArrivee);
        }
        if (pilote != null) {
            this.setPilote(pilote);
        }
        if (equipage != null) {
            this.setEquipage(equipage);
        }
        if (etat != null) {
            this.setEtat(etat);
        }
    }

    public void ajouterAListeVol(Vol vol){
        listeVol.add(vol);
    }

    public void listingPassager(){
        for (int i = 0; i < passager.size(); i++) {
            passager.get(i).toString();
        }
    }

    public void delete(Vol vol){
        vol = null;
    }
}

