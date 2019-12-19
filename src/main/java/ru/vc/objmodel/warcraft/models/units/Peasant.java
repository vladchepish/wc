package ru.vc.objmodel.warcraft.models.units;

import ru.vc.objmodel.warcraft.models.buildings.*;

public class Peasant {

    private final int hitPoints = 220;
    private final int manaPoints = 0;
    private int armor = 0;
    private double ground_attack = 5.5;

    public Peasant(){

    }

    /** Make a Militia Unit from Peasant for 40 seconds*/
    public Militia makeAMilitia(){
        return new Militia();
    }

    /** Repair something */
    public void repair(){

    }

    public void getGold(){

    }

    public void getLumber(){

    }

    /** Buildings */
    public Farm buildFarm(){
        return new Farm();
    }

    public TownHall buildTownHall(){
        return new TownHall();
    }

    public Baracks buildBaracks(){
        return new Baracks();
    }

    public ArcaneSanctum buildArcaneSanctum(){
        return new ArcaneSanctum();
    }

    public Forge buildForge(){
        return new Forge();
    }

    public GryphoAviari buildGryphonAviari(){
        return new GryphoAviari();
    }


}
