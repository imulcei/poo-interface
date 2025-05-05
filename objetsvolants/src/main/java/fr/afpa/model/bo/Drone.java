package fr.afpa.model.bo;

public class Drone implements Volant, Rechargeable {
    private int identifiant;
    private int autonomie;
    private double vitesseMax;

    // Passer par les setters pour mettre à jour les attributs
    // JavaDoc
    public Drone(int identifiant, int autonomie, double vitesseMax) {
        this.identifiant = identifiant;
        this.autonomie = autonomie;
        this.vitesseMax = vitesseMax;
    }

    // C'est mieux de créer une constante plutôt que d'utiliser une valeur numérique
    @Override
    public void voler() {
        autonomie -= 10;
        System.out.println("Le drone " + identifiant + " vole à une vitesse maximale de " + vitesseMax + " km/h.");
    }

    @Override
    public double vitesseMax() {
        return this.vitesseMax;
    }

    // Utiliser la valeur BATTERIE_INIT au lieu d'une valeur numérique
    @Override
    public void recharger() {
        this.autonomie = 100;
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
