package ru.vc.objmodel.warcraft;

import ru.vc.objmodel.warcraft.models.buildings.Baracks;
import ru.vc.objmodel.warcraft.models.buildings.Farm;
import ru.vc.objmodel.warcraft.models.buildings.TownHall;
import ru.vc.objmodel.warcraft.models.units.Peasant;

public class Main {

    public static void main(String args[]){
        TownHall townHall = new TownHall();
        Peasant peasantOne = new Peasant();
        Peasant peasantTwo = new Peasant();
        Peasant peasantThree = new Peasant();
        Peasant peasantFour = new Peasant();
        Peasant peasantFive = new Peasant();

        Peasant peasantSix = townHall.producedPeasant();
        Peasant peasantSeven = townHall.producedPeasant();

        Farm farmOne = peasantOne.buildFarm();
        Baracks baracksOne = peasantTwo.buildBaracks();
        peasantFour.getLumber();
        peasantFour.getGold();
        peasantFive.getGold();
    }

}
