package fr.isep.vindev;

import java.util.List;
import java.util.UUID;

public class Passager extends Personne {
    private String passeport;

    public Passager(UUID identifiant, String nom, String adresse, String contact, String passeport){
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    @Override
    public String toString() {
        return "Passager [identifiant=" + this.getIdentifiant() + ", nom=" + this.getNom() + ", passport=" + this.getPasseport() + "]";
    }

    public String getPasseport(){
        return passeport;
    }

    public static void obtenirReservations(UUID numeroReservation, List<Reservation> listeReservation){
        for (Reservation reservation : listeReservation){
            if (reservation.getNumeroReservation().equals(numeroReservation)){
                System.out.println("Numéro de réservation: " + reservation.getNumeroReservation() +
                        ", Date de la réservation: " + reservation.getDateReservation() +
                        ", statut du la réservation: " + reservation.getStatut());
            }
        }
    }

    public static String annulerReservation(UUID numeroReservation, List<Reservation> listeReservation){
        System.out.println("Suppression de votre Réservation en cours...");
        for (Reservation reservations : listeReservation){
            if(reservations.getNumeroReservation().equals(numeroReservation)){
                listeReservation.remove(reservations);
                return "Votre réservation a été supprimée !";
            }
        }return "Votre réservation n'a pas pû être supprimée !";
    }

    public static void reserverVol(Vol vol, Passager passager){

    }

}

