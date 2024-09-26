public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
        initializeCharacter();
    }

    @Override
    public void initializeCharacter() {
        setTypeChar("Warrior");
        setHealthLevelChar(10); // Valeur par défaut pour Warrior
        setStrengthChar(10);     // Valeur par défaut pour Warrior
        offensiveEquipement = new Weapon();
        offensiveEquipement.setNameWeapon("Sword");
        defensiveEquipement = new Shield();
        defensiveEquipement.setNameShield("Shield");
    }

}
