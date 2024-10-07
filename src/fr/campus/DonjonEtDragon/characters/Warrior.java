package fr.campus.DonjonEtDragon.characters;

import fr.campus.DonjonEtDragon.equipements.Shield;
import fr.campus.DonjonEtDragon.equipements.Weapon;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
        initializeCharacter();
    }

    @Override
    public void initializeCharacter() {
        setTypeChar("fr.campus.DonjonEtDragon.characters.Warrior");
        setHealthLevelChar(1000); // Valeur par défaut pour fr.campus.DonjonEtDragon.characters.Warrior
        setStrengthChar(10);     // Valeur par défaut pour fr.campus.DonjonEtDragon.characters.Warrior
        offensiveEquipement = new Weapon();
        defensiveEquipement = new Shield();
        defensiveEquipement.setNameShield("fr.campus.DonjonEtDragon.equipements.Shield");
    }

}
