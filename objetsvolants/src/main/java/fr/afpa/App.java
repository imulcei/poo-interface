package fr.afpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import fr.afpa.model.bo.Avion;
import fr.afpa.model.bo.Volant;
import fr.afpa.model.bo.Drone;
import fr.afpa.model.bo.Rechargeable;

public class App {
    public static void main(String[] args) {

        Avion avion1 = new Avion("A380", 1175, 4);
        Avion avion2 = new Avion("787", 945, 2);
        Avion avion3 = new Avion("A350", 1098, 4);
        Drone drone1 = new Drone(3456, 100, 80.0);
        Drone drone2 = new Drone(214, 80, 75.0);
        List<Volant> volants = new ArrayList<>();
        volants.add(avion1);
        volants.add(avion2);
        volants.add(avion3);
        volants.add(drone1);
        volants.add(drone2);

        for (Volant volant : volants) {
            volant.voler();
            if (volant instanceof Rechargeable) {
                ((Rechargeable) volant).recharger();
                System.out.println("La batterie du drone a été rechargée.");
            }
            System.out.println(volant.toString());
        }

        volants.sort(Comparator.comparingDouble(Volant::vitesseMax));
        System.out.println(volants);
    }
}
