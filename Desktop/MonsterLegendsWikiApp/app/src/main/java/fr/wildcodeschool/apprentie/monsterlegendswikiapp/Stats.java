package fr.wildcodeschool.apprentie.monsterlegendswikiapp;

import java.io.Serializable;

/**
 * Created by Shooty31 on 14/09/2016.
 */
public class Stats implements Serializable {
    private static final long serialVersionUID = -7060210544600464481L;

    private int pv;
    private int power;
    private int speed;
    private int energy;


    public Stats(int pv,int power,int speed,int energy){

        this.pv = pv;
        this.power = power;
        this.speed = speed;
        this.energy = energy;
    }



    public int getPv(){
        return this.pv;
    }

    public int getPower(){
        return this.power;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getEnergy(){
        return this.energy;
    }

}
