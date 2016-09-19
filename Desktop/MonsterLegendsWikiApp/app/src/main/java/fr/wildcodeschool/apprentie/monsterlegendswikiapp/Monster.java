package fr.wildcodeschool.apprentie.monsterlegendswikiapp;

import java.io.Serializable;

/**
 * Created by Shooty31 on 12/09/2016.
 */
public class Monster implements Serializable {
    String id;
    String name;
    int egg;
    String type;
    private Stats stats;
    int evo;

    public Monster(String id, String name, int egg, String type, Stats stats, int evo) {
        this.id = id;
        this.name = name;
        this.egg = egg;
        this.type = type;
        this.stats = stats;
        this.evo = evo;
    }
    public String getId() { return this.id;}
    public String getName() {return this.name;}
    public int getEgg() {
        return this.egg;
    }
    public String getType() {
        return this.type;
    }
    public Stats getStats() {return this.stats;}
    public int getEvo() {return this.evo;}
}

