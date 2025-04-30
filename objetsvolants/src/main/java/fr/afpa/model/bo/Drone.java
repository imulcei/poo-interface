package fr.afpa.model.bo;

public class Drone implements Volant, Rechargeable {
    private int identifiant;
    private int autonomie;
    private double vitesseMax;

    @Override
    public void voler() {
        System.out.println("Le drone " + identifiant + " vole à une vitesse maximale de " + vitesseMax + " km/h.");
    }

    @Override
    public double vitesseMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vitesseMax'");
    }

    @Override
    public void recharger() {
        autonomie = 100;
    }

    @Override
    public int niveauBatterie() {
        return autonomie;
    }
}
