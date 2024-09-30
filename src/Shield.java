public class Shield extends DefensiveEquipement implements Case{
    public Shield(){
        initializeShield();
    }

    public void initializeShield(){
        setDefenseLevel(10);
        setNameShield("Shield");
    }

    @Override
    public void interact(Character character) {

    }

    @Override
    public String toString() {
        return "I'm a " + getNameShield();
    }
}
