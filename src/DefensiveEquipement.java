public abstract class DefensiveEquipement {
    private String nameShield;
    private int defenseLevel;

    public DefensiveEquipement(){}


    public String getNameShield() {
        return nameShield;
    }

    public void setNameShield(String nameShield) {
        this.nameShield = nameShield;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }
}
