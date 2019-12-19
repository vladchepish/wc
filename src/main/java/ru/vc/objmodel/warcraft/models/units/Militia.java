package ru.vc.objmodel.warcraft.models.units;

public class Militia extends Peasant{
    public Militia(){

    }

    public Peasant returnToResources(){
        return new Peasant();
    }

}
