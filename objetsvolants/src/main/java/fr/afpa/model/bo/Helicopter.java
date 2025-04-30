package fr.afpa.model.bo;

public class Helicopter implements Volant {
    private String modele;
    private double vitesseMax;

    public Helicopter(String modele, double vitesseMax) {
        this.modele = modele;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void voler() {
        System.out.println("L'hélicoptère " + modele + " vole à une vitesse maximale de " + vitesseMax + " km/h.");

    }

    @Override
    public double vitesseMax() {
        return this.vitesseMax;
    }

    @Override
    public String toString() {
        return "Helicopter [modele=" + modele + ", vitesseMax=" + vitesseMax + "]";
    }

}
