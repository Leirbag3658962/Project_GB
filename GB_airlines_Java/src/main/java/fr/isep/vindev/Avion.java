package fr.isep.vindev;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean isAffecte;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.isAffecte = false;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isAffecte() {
        return isAffecte;
    }

    public void setAffecte(boolean affecte) {
        isAffecte = affecte;
    }

    @Override
    public String toString() {
        return "Avion [Immatriculation:" + immatriculation + ", modele:" + modele + ", capacite:" + capacite;
    }

    public void affecterVol(Vol vol){
        if(isAffecte){
            System.out.println("Erreur: cet avion est deja affecte");
        }
        else {
            vol.setAvion(this);
            vol.setIsAvionAffecte(true);
            isAffecte = true;
        }
    }

    public void verifierDisponibilite(){
        if(isAffecte){
            System.out.println("Cet avion n'est pas disponible");
        }
        else {
            System.out.println("Cet avion est disponible");
        }
    }

}
