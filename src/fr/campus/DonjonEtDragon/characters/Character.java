package fr.campus.DonjonEtDragon.characters;

import fr.campus.DonjonEtDragon.equipements.DefensiveEquipement;
import fr.campus.DonjonEtDragon.equipements.OffensiveEquipement;

public abstract class Character {
    private String nameChar;
    private String typeChar;
    private int healthLevelChar;
    private int strengthChar;
    protected OffensiveEquipement offensiveEquipement;
    protected DefensiveEquipement defensiveEquipement;



    public Character(String name) {
        nameChar = name;
    }

    public abstract void initializeCharacter();

    public Character() {

    }

    public String toString() {
        if (typeChar.equals("fr.campus.DonjonEtDragon.characters.Warrior") || typeChar.equals("fr.campus.DonjonEtDragon.characters.Magician")) {
            return "Hi im " + this.nameChar + ", a " + this.typeChar + " of Dunjeon & Dragons, i have "
                    + healthLevelChar + " health level and " + strengthChar + " strength level.";
        } else {
            return "Please, choose a valid type for your character ('fr.campus.DonjonEtDragon.characters.Warrior' or 'fr.campus.DonjonEtDragon.characters.Magician')";
        }
    }

    public String getNameChar() {
        return nameChar;
    }

    public String getTypeChar() {
        return typeChar;
    }

    public int getHealthLevelChar() {
        return healthLevelChar;
    }

    public int getStrengthChar() {
        return strengthChar;
    }

    public OffensiveEquipement getOffensiveEquipement() {
        return offensiveEquipement;
    }

    public void setOffensiveEquipement(OffensiveEquipement offensiveEquipement) {
        this.offensiveEquipement = offensiveEquipement;
    }

    public DefensiveEquipement getDefensiveEquipement() {
        return defensiveEquipement;
    }

    public void setDefensiveEquipement(DefensiveEquipement defensiveEquipement) {
        this.defensiveEquipement = defensiveEquipement;
    }

    public void setNameChar(String nameChar) {
        this.nameChar = nameChar;
    }

    public void setTypeChar(String typeChar) {
        this.typeChar = typeChar;
    }

    public void setHealthLevelChar(int healthLevelChar) {
        this.healthLevelChar = healthLevelChar;
    }

    public void setStrengthChar(int strengthChar) {
        this.strengthChar = strengthChar;
    }


}
