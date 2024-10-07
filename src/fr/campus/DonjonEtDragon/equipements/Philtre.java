package fr.campus.DonjonEtDragon.equipements;

public class Philtre extends DefensiveEquipement{
    public Philtre(){
        initializeShield();
    }

    public void initializeShield(){
        setDefenseLevel(10);
        setNameShield("fr.campus.DonjonEtDragon.equipements.Philtre");
    }
}
