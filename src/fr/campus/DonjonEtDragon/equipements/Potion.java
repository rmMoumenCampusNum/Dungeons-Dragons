package fr.campus.DonjonEtDragon.equipements;

import fr.campus.DonjonEtDragon.characters.Character;
import fr.campus.DonjonEtDragon.engine.Case;

public class Potion implements Case {
    private int healthLevel;

    public Potion(int health){
        healthLevel = health;
    }

    public int getHealthLevel(){
        return healthLevel;
    }

    @Override
    public String toString() {
        return "Je suis une potion et je te rends " + getHealthLevel() + " points de vie";
    }

    @Override
    public void interact(Character character) {
character.setHealthLevelChar(character.getHealthLevelChar() + getHealthLevel());
        System.out.println("Nouveau niveau de vie : " + character.getHealthLevelChar());
    }
}
