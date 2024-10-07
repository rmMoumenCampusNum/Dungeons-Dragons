package fr.campus.DonjonEtDragon.equipements;

public class Weapon extends OffensiveEquipement {
    public Weapon(){
        initializeWeapon();
    }

    public void initializeWeapon(){
        setAttackLevel(10);
        setNameWeapon("Sword");
    }
}

