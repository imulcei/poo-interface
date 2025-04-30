package fr.afpa.model.bo;

public class Avion implements Volant {
    private String modele;
    private double vitesseMax;
    private int nbMoteurs;

    @Override
    public void voler() {
        System.out.println("L'avion " + modele + " vole à une vitesse maximale de " + vitesseMax + " km/h.");
    }

    @Override
    public double vitesseMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vitesseMax'");
    }
}
