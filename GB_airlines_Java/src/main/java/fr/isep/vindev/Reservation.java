package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Reservation {
    public static UUID numeroReservation;
    public Date dateReservation;
    public String statut;
    public static List<Reservation> listereservation = new ArrayList<>();
    private ArrayList<Vol>reservations;

    public Reservation(UUID numeroReservation, Date dateReservation, String statut){
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.reservations = new ArrayList<>();
    }

    public UUID getNumeroReservation(){
        return numeroReservation;
    }
    public Date getDateReservation(){
        return dateReservation;
    }
    public String getStatut(){
        return statut;
    }
    public ArrayList<Vol> getReservations(){
        return reservations;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }


    public void ajouterReservation(Reservation reservation){
        listereservation.add(reservation);
    }

    public static String annulerReservation(UUID numeroReservation, List<Reservation> listeReservation){
        System.out.println("Suppression de votre Réservation en cours...");
        for (Reservation reservations : listeReservation){
            if(reservations.getNumeroReservation().equals(numeroReservation)){
                listeReservation.remove(reservations);
                return "Votre réservation a été supprimée !";
            }
        } return "Votre réservation n'a pas pû être supprimée !";
    }

    public static void modifierReservation(UUID numeroReservation, List<Reservation> listeReservation, Date nouvelleDate,
                                    String nouveauStatut){
        for (Reservation reservation : listeReservation){
            if (reservation.getNumeroReservation().equals(numeroReservation)){
                reservation.setDateReservation(nouvelleDate);
                reservation.setStatut(nouveauStatut);
            }
        }
    }

    public static void confirmerReservation(UUID numeroReservation, List<Reservation> listeReservation){
        for (Reservation reservation : listeReservation){
            if (reservation.getNumeroReservation().equals(numeroReservation)){
                reservation.setStatut("Réservation confirmée !");
            }
        }
    }

}

