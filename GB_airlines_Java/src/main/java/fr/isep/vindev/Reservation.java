package fr.isep.vindev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Reservation {
    public static UUID numeroReservation;
    public Date dateReservation;
    public String statut;
    private List<Reservation> listereservation = new ArrayList<>();

    public Reservation(UUID numeroReservation, Date dateReservation, String statut){
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
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

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }


    public void ajouterReservation(Reservation reservation){
        listereservation.add(reservation);
    }

    public void annulerReservation(UUID numeroReservation, List<Reservation> listeReservation){
        for (Reservation reservations : listeReservation){
            if(reservations.getNumeroReservation().equals(numeroReservation)){
                listeReservation.remove(reservations);
            }
        }
    }

    public void modifierReservation(UUID numeroReservation, List<Reservation> listeReservation, Date nouvelleDate,
                                    String nouveauStatut){
        for (Reservation reservation : listeReservation){
            if (reservation.getNumeroReservation().equals(numeroReservation)){
                reservation.setDateReservation(nouvelleDate);
                reservation.setStatut(nouveauStatut);
            }
        }
    }
}

