package fr.campus.DonjonEtDragon.equipements;

import fr.campus.DonjonEtDragon.characters.Character;
import fr.campus.DonjonEtDragon.engine.Case;

public class Spell extends OffensiveEquipement implements Case {
    public Spell(){
        initializeWeapon();
    }


    public void initializeWeapon(){
        setAttackLevel(10);
        setNameWeapon("fr.campus.DonjonEtDragon.equipements.Spell");
    }

    @Override
    public void interact(Character character) {

    }
}
