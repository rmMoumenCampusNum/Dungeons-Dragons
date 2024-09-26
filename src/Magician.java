public class Magician extends Character {
    public Magician(String name) {
        super(name);
        initializeCharacter();
    }

    @Override
    public void initializeCharacter() {
        setTypeChar("Magician");
        setHealthLevelChar(6);  // Valeur par défaut pour Magician
        setStrengthChar(15);     // Valeur par défaut pour Magician
        offensiveEquipement = new Spell();
        defensiveEquipement = new Philtre();
    }

}
