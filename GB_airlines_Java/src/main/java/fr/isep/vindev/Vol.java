package fr.isep.vindev;

import java.util.ArrayList;

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
    public ArrayList<Employe> equipage;
    private boolean isAvionAffecte;
    private boolean isAeroportDebutAffecte;
    private boolean isAeroportArriveeAffecte;
    private boolean isPiloteAffecte;
    private boolean isEquipageAffecte;

    public Vol(int numeroVol, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.isEquipageAffecte = false;
        this.isAeroportDebutAffecte = false;
        this.isAeroportArriveeAffecte = false;
        this.isAvionAffecte = false;
        this.etat = "Incomplete";
    }

    // <editor-fold desc="Getter and setter">
    public ArrayList<Employe> getEquipage(){
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
        if (etat == "Prevu" || etat == "Annule" || etat == "Retarde") {
            this.etat = etat;
        }
        else {
            System.out.println("Erreur : etat non valide");
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

    public void setEquipage(ArrayList<Employe> equipage) {
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

    public void setPiloteAffecte(boolean piloteAffecte) {
        isPiloteAffecte = piloteAffecte;
    }

    public void setAeroportArriveeAffecte(boolean aeroportArriveeAffecte) {
        isAeroportArriveeAffecte = aeroportArriveeAffecte;
    }

    public void setAeroportDebutAffecte(boolean aeroportDebutAffecte) {
        isAeroportDebutAffecte = aeroportDebutAffecte;
    }

    public void setAvionAffecte(boolean avionAffecte) {
        isAvionAffecte = avionAffecte;
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
        return "Vol [numero: " + numeroVol + ", avion: " + avion + ", depart: " + origine + ", arrivee: " + destination + ", heure de depart: " + dateHeureDepart + ", heure d'arrivee: " + dateHeureArrivee + ", etat: " + etat + ", Liste des employés: " + equipage + "]";
    }

    public void planifierVol(){

    }

    public void annulerVol(){
        this.avion.setIsAffecte(false);
        this.pilote.setIsAffecte(false);

        this.setEtat("Annule");
    }

    public void modifierVol(){


    }

    public void ajouterAListeVol(Vol vol){
        listeVol.add(vol);
    }

    public void listingPassager(){
        for (int i = 0; i < passager.size(); i++) {
            passager.get(i).toString();
        }
    }
}

