public class Opponent implements Case {
    private String name;
    private int attack;
    private int health;


    public Opponent(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public void interact(Character character) {

    }

    public String toString() {
        return "Ah, ah, ah je suis un méchant et j'ai " + attack + " points d'attaque";
    }
}
