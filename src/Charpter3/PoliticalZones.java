package Charpter3;

import java.util.Objects;

public enum PoliticalZones {
    NORTH_CENTRAL("Benue, FCT, Kogi, Kwara, Nasarawa, Niger, Plateau"),
    NORTH_East("Adamawa,Bouchi,Borno,Gombe,Taraba,Yobe "),
    NORTH_WEST("Kaduna,Katsina,Kano,Kebbi,Sokoto,Jigawa,Zamfara"),
    SOUTH_EAST("Abia,Anambra,Ebonyi, Enugu,Imo"),
    SOUTH_SOUTH("Akwa-ibom, Bayelsa, Cross-River, Delta, Edo, Rivers"),
    SOUTH_WEST("Ekiti, Lagos, Osun, Ondo, Ogun, Oyo");

    private String states;
    private String name;

    PoliticalZones(String states) {
       this.states = states;
    }



}





