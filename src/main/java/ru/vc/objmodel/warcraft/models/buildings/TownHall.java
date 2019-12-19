package ru.vc.objmodel.warcraft.models.buildings;

import ru.vc.objmodel.warcraft.models.units.Militia;
import ru.vc.objmodel.warcraft.models.units.Peasant;

import java.util.ArrayList;
import java.util.List;

public class TownHall {

    private final int health = 1500;
    private int armor = 5;

    public Peasant producedPeasant(){
        return new Peasant();
    }

    public List<Militia> callToArmy(List<Peasant> peasants){
        List<Militia> militias = new ArrayList<Militia>();
        for (Peasant peasant : peasants){
            militias.add(peasant.makeAMilitia());
        }
        return militias;
    }

}
