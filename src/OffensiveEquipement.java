public abstract class OffensiveEquipement {
    private String nameWeapon;
    private int attackLevel;

    public OffensiveEquipement(){}



    public String toString(){
        return "I'm a " + nameWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }


}
