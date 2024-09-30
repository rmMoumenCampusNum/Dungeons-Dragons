public class Spell extends OffensiveEquipement implements Case{
    public Spell(){
        initializeWeapon();
    }


    public void initializeWeapon(){
        setAttackLevel(10);
        setNameWeapon("Spell");
    }

    @Override
    public void interact(Character character) {

    }
}
