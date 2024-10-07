package fr.campus.DonjonEtDragon.engine;

import fr.campus.DonjonEtDragon.characters.Character;

public class EmptyCase implements Case {

    public EmptyCase(){

    }

    @Override
    public String toString() {
        return "I'm an empty case";
    }

    @Override
    public void interact(Character character) {

    }
}
