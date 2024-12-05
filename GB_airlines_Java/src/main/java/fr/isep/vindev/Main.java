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
            String arriveeStr = "01-01-2024 9:00";
            Date dateDepart = formatter.parse(departStr);
            Date dateArrivee = formatter.parse(arriveeStr);
            Vol ParisLondres = new Vol(1,dateDepart, dateArrivee, equipagevol1);
            Vol.listeVol.add(ParisLondres);
            System.out.println(ParisLondres.toString());

            //Création Pilotes
            String strEmbaucheRoger = "01-01-2023 08:00";
            Date dateEmbaucheRoger = formatter.parse(strEmbaucheRoger);
            Pilote pilote1 = new Pilote(UUID.randomUUID(),"Roger","1 rue de Rennes","@free.fr", dateEmbaucheRoger,1);
            Pilote.affecterVol(ParisLondres,pilote1);
            Employe.listeEmploye.add(pilote1);

            //Création Personnel de Cabine
            String strEmbaucheTitouan = "01-02-2023 08:00";
            Date dateEmbaucheTitouan = formatter.parse(strEmbaucheTitouan);
            PersonnelCabine personnel1 = new PersonnelCabine(UUID.randomUUID(),"Titouan","2 rue des roses","@orange.fr",dateEmbaucheTitouan,2,"Bac+1");
            UUID idPersonnel1 = personnel1.getIdentifiant();
            PersonnelCabine.affecterVol(ParisLondres, personnel1);
            Employe.listeEmploye.add(personnel1);

            //Test fonction obtenirRole, obtenirVol, Obtenirinfo
            System.out.println("");
            System.out.println(Pilote.obtenirVol(1,Vol.listeVol));
            System.out.println(Employe.obtenirRole(idPersonnel1));
            System.out.println(Personne.obtenirInfos(pilote1));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}