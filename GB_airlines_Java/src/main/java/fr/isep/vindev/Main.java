package fr.isep.vindev;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Employe> equipagevol1 = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

            // Création Vols
            String departStr = "01-01-2024 08:00";
            String arriveeStr = "01-01-2024 09:00";
            //Date dateDepart = formatter.parse(departStr);
            //Date dateArrivee = formatter.parse(arriveeStr);
            Vol ParisLondres = new Vol(1, "Paris", "Londres", departStr, arriveeStr);
            Vol.listeVol.add(ParisLondres);
            System.out.println("Info sur le vol Paris-Londres");
            System.out.println(ParisLondres.toString());

            //Création Avions
            Avion avion1 = new Avion("AA-123-BB","A320",500);
            avion1.affecterVol(ParisLondres);

            //Création Pilotes
            String strEmbaucheRoger = "01-01-2023 08:00";
            Date dateEmbaucheRoger = formatter.parse(strEmbaucheRoger);
            Pilote pilote1 = new Pilote(UUID.randomUUID(),"Roger","1 rue de Rennes","@free.fr", dateEmbaucheRoger,1);
            pilote1.affecterVol(ParisLondres);
            Employe.listeEmploye.add(pilote1);

            //Création Personnel de Cabine
            String strEmbaucheTitouan = "01-02-2023 08:00";
            Date dateEmbaucheTitouan = formatter.parse(strEmbaucheTitouan);
            PersonnelCabine personnel1 = new PersonnelCabine(UUID.randomUUID(),"Titouan","2 rue des roses","@orange.fr",dateEmbaucheTitouan,2,"Bac+1");
            UUID idPersonnel1 = personnel1.getIdentifiant();
            personnel1.affecterVol(ParisLondres);
            Employe.listeEmploye.add(personnel1);

            //Création d'un passager
            UUID idpassager = UUID.randomUUID();
            Passager passager1 = new Passager(idpassager,"Stéphanie","10 rue le moine","flemme@gmail.com","Valide");
            passager1.reserverVol(ParisLondres,passager1);

            //Création Réservation
            String stranciennereservation1 = "01-12-2023 08:00";
            Date anciennedatereservation1 = formatter.parse(stranciennereservation1);
            String strnewreservation1 = "21-12-2023 08:00";
            Date newdatereservation1 = formatter.parse(stranciennereservation1);
            UUID idReservation = UUID.randomUUID();
            Reservation reservation1 = new Reservation(idReservation,anciennedatereservation1,"En cours de création...");
            Reservation.listereservation.add(reservation1);


            //Test méthodes de Réservation
            System.out.println((" "));
            System.out.println("Test des méthodes de réservations :");
            System.out.println("Ancienne Réservation :");
            Passager.obtenirReservations(idReservation,Reservation.listereservation);
            System.out.println("Nouvelle Réservation :");
            Reservation.modifierReservation(idReservation, Reservation.listereservation,newdatereservation1,"En cours de modifications...");
            Passager.obtenirReservations(idReservation,Reservation.listereservation);
            Reservation.confirmerReservation(idReservation, Reservation.listereservation);
            Passager.obtenirReservations(idReservation,Reservation.listereservation);
            System.out.println(Reservation.annulerReservation(idReservation,Reservation.listereservation));


            //Test fonction obtenirRole, obtenirVol, Obtenirinfo
            System.out.println("");
            System.out.println("Test obtenirVol");
            System.out.println(Pilote.obtenirVol(1,Vol.listeVol));
            System.out.println("Test obtenirRôle");
            System.out.println(Employe.obtenirRole(idPersonnel1));
            System.out.println("Test obtenirInfos");
            System.out.println(Personne.obtenirInfos(pilote1));

            //Affichage de toutes les réservations
            System.out.println("Liste des réservations :");
            for (Reservation reservation : Reservation.listereservation){
                System.out.println(reservation.getNumeroReservation());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}