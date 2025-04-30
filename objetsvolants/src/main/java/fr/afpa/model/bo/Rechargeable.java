package fr.afpa.model.bo;

public interface Rechargeable {
    static final int BATTERIE_INIT = 100;
    void recharger();
    int niveauBatterie();

    default void niveauBatteriePourcentage() {
        System.out.println("Batterie chargée à " + niveauBatterie() + "%.");
    }
}
