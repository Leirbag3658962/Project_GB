package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;

public class Vol {
    private int numeroVol;
    private Avion avion;
    public ArrayList<Employe> equipage;
    private ArrayList<Passager> passager;
    public static ArrayList<Vol> listeVol;
    private Aeroport origine;
    private Aeroport destination;
    private Date dateHeureDepart;
    private Date dateHeureArrivee;
    private boolean etat;
    private boolean isComplete;

    public Vol(int numeroVol, Date dateHeureDepart, Date dateHeureArrivee, ArrayList<Employe> equipage) {
        this.numeroVol = numeroVol;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.equipage = new ArrayList<>();
    }

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

    public Aeroport getOrigine() {
        return origine;
    }

    public void setOrigine(Aeroport origine) {
        this.origine = origine;
    }

    public Aeroport getDestination() {
        return destination;
    }

    public void setDestination(Aeroport destination) {
        this.destination = destination;
    }

    public Date getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(Date dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public Date getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(Date dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Vol [numero:" + numeroVol + ", avion:" + avion + ", depart:" + origine + ", arrivee:" + destination + ", heure de depart:" + dateHeureDepart + ", heure d'arrivee:" + dateHeureArrivee + ", etat:" + etat + ", complet: " + isComplete + "]";
    }

    public void planifierVol(){

    }

    public void annulerVol(int numeroVol){

    }

    public void ajouterAListeVol(Vol vol){
        listeVol.add(vol);
    }
}

