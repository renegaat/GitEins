package de.hansecom.giteins.domain;

public class Fahrkarte {

    double preis;
    String name;

    @Override
    public String toString() {
        return "Preis : " + preis + " Name : " + name;
    }

    public Fahrkarte(double preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
