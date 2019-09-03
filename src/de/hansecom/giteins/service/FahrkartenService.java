package de.hansecom.giteins.service;

import de.hansecom.giteins.domain.Fahrkarte;

public interface FahrkartenService {
    public Fahrkarte erzeugeFahrkarte(double preis, String name);
}
