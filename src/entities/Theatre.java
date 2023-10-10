package entities;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0;
        this.recetteTotale = 0.0;
    }

    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClientsInscrits + nombreClients <= capaciteMax) {
            totalClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prixPlace;
        } else {
            System.out.println("La capacité maximale du théâtre est atteinte, impossible d'inscrire plus de clients.");
        }
    }

    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}