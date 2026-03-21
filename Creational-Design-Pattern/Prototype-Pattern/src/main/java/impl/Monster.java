package impl;

import service.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Prototype {

    private int health;
    private List<String> abilities;

    public Monster(int health, List<String> abilities) {
        this.health = health;
        this.abilities = abilities;
    }

    public Monster(Monster source) {
        this.health = source.health;
        this.abilities = new ArrayList<>(source.abilities);
    }

    public void addAbilities(String abilities) {
        this.abilities.add(abilities);
    }

    @Override
    public Monster clone() {
        return new Monster(this);
    }

    @Override
    public String toString() {
        return "Monster [Health=" + health + ", Abilities=" + abilities + "]";
    }
}
