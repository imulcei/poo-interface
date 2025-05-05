package fr.afpa.model.bo;

public class Drone implements Volant, Rechargeable {
    private int identifiant;
    private int autonomie;
    private double vitesseMax;
    private static final int CONSOMMATION_PAR_VOL = 10;

    public Drone(int identifiant, int autonomie, double vitesseMax) {
        setIdentifiant(identifiant);
        setAutonomie(autonomie);
        setVitesseMax(vitesseMax);
    }

    @Override
    public void voler() {
        autonomie -= CONSOMMATION_PAR_VOL;
        System.out.println("Le drone " + identifiant + " vole à une vitesse maximale de " + vitesseMax + " km/h.");
    }

    @Override
    public double vitesseMax() {
        return this.vitesseMax;
    }

    @Override
    public void recharger() {
        this.autonomie = BATTERIE_INIT;
    }

    @Override
    public int niveauBatterie() {
        return this.autonomie;
    }

    @Override
    public String toString() {
        return "Drone [identifiant=" + identifiant + ", autonomie=" + autonomie + ", vitesseMax=" + vitesseMax + "]";
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}
