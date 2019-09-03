package de.hansecom.giteins;

import de.hansecom.giteins.domain.Fahrkarte;
import de.hansecom.giteins.service.FahrkartenServiceImpl;

public class Main {
    public static void main(String[] args) {
        FahrkartenServiceImpl fahrkartenService = new FahrkartenServiceImpl();
        Fahrkarte meineNeueFahrkarte =  fahrkartenService.erzeugeFahrkarte(10, "Fahrkarte");
        System.out.println(meineNeueFahrkarte.toString());

    }
}
