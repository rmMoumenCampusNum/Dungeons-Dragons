package fr.campus.DonjonEtDragon.engine;

import fr.campus.DonjonEtDragon.characters.Character;

public class EmptyCase implements Case {

    public EmptyCase(){

    }

    @Override
    public String toString() {
        return "Empty case, move forward";
    }

    @Override
    public void interact(Character character) {
        System.out.println("Empty case, move forward.");
    }
}
