package de.hansecom.giteins.service;

import de.hansecom.giteins.domain.Fahrkarte;

public class FahrkartenServiceImpl implements FahrkartenService{

    @Override
    public Fahrkarte erzeugeFahrkarte(double preis, String name) {
        return new Fahrkarte(preis, name);
    }
}
