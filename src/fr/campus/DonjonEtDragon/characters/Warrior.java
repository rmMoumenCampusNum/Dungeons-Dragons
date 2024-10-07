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
        setHealthLevelChar(100); // Valeur par défaut pour Warrior
        setStrengthChar(10);     // Valeur par défaut pour Warrior
        offensiveEquipement = new Weapon();
        offensiveEquipement.setNameWeapon("Sword");
        defensiveEquipement = new Shield();
        defensiveEquipement.setNameShield("Shield");
    }

}
