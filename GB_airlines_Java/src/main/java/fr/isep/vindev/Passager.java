package fr.isep.vindev;

import java.util.List;
import java.util.UUID;

public class Passager extends Personne {
    private String passeport;

    public Passager(UUID identifiant, String nom, String adresse, String contact, String passeport){
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public String getPasseport(){
        return passeport;
    }

    public void obtenirReservations(UUID numeroReservation, List<Reservation> listeReservation){
        for (Reservation reservation : listeReservation){
            if (reservation.getNumeroReservation().equals(numeroReservation)){
                System.out.println("Numéro de réservation: " + reservation.getNumeroReservation() +
                        ", Date de la réservation: " + reservation.getNumeroReservation() +
                        ", statut du la réservation: " + reservation.getNumeroReservation());
            }
        }
    }

    public void annulerReservation(UUID numeroReservation, List<Reservation> listeReservation){
        for (Reservation reservations : listeReservation){
            if(reservations.getNumeroReservation().equals(numeroReservation)){
                listeReservation.remove(reservations);
            }
        }
    }


}

