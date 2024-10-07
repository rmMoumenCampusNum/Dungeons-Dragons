package fr.campus.DonjonEtDragon.equipements;

import fr.campus.DonjonEtDragon.characters.Character;
import fr.campus.DonjonEtDragon.engine.Case;

public class Shield extends DefensiveEquipement implements Case {
    public Shield(){
        initializeShield();
    }

    public void initializeShield(){
        setDefenseLevel(10);
        setNameShield("fr.campus.DonjonEtDragon.equipements.Shield");
    }

    @Override
    public void interact(Character character) {
        System.out.println("Joli bouclier ... tu l'équipes ! ");
    character.setHealthLevelChar(character.getHealthLevelChar() + getDefenseLevel());
        System.out.println("Nouveau niveau de vie : " + character.getHealthLevelChar());
    }

    @Override
    public String toString() {
        return "I'm a " + getNameShield();
    }
}
