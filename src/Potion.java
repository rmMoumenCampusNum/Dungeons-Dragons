public class Potion implements Case{
    private int healthLevel;

    public Potion(int health){
        healthLevel = health;
    }

    public int getHealthLevel(){
        return healthLevel;
    }

    @Override
    public String toString() {
        return "Je suis une potion et je te rends " + getHealthLevel() + " points de vie";
    }

    @Override
    public void interact(Character character) {

    }
}
