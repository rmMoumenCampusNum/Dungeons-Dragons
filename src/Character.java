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
        if (typeChar.equals("Warrior") || typeChar.equals("Magician")) {
            return "Hi im " + this.nameChar + ", a " + this.typeChar + " of Dunjeon & Dragons, i have "
                    + healthLevelChar + " health level and " + strengthChar + " strength level.";
        } else {
            return "Please, choose a valid type for your character ('Warrior' or 'Magician')";
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
