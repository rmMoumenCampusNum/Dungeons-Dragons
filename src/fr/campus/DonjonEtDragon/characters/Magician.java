package fr.campus.DonjonEtDragon.characters;

import fr.campus.DonjonEtDragon.equipements.Philtre;
import fr.campus.DonjonEtDragon.equipements.Spell;

public class Magician extends Character {
    public Magician(String name) {
        super(name);
        initializeCharacter();
    }

    @Override
    public void initializeCharacter() {
        setTypeChar("fr.campus.DonjonEtDragon.characters.Magician");
        setHealthLevelChar(6);  // Valeur par défaut pour fr.campus.DonjonEtDragon.characters.Magician
        setStrengthChar(15);     // Valeur par défaut pour fr.campus.DonjonEtDragon.characters.Magician
        offensiveEquipement = new Spell();
        defensiveEquipement = new Philtre();
    }

}
