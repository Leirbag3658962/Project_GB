package fr.isep.vindev;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    // <editor-fold desc="Getter and setter">
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return nom;
    }

    public void affecterVol(Vol vol, boolean isArrivee){
        if (isArrivee){
            vol.setAeroportArriveeAffecte(this);
            vol.setIsAeroportArriveeAffecte(true);
        }
        else {
            vol.setAeroportDebutAffecte(this);
            vol.setIsAeroportDebutAffecte(true);
        }
    }

    public void delete(Aeroport aeroport){
        aeroport = null;
    }
}

