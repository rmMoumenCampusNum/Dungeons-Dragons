package fr.campus.DonjonEtDragon.engine;

import fr.campus.DonjonEtDragon.characters.Character;
import fr.campus.DonjonEtDragon.characters.Dragon;
import fr.campus.DonjonEtDragon.characters.Gobelin;
import fr.campus.DonjonEtDragon.characters.Opponent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Game {
    int playerPosition = 0;
    int maxCase = 64;
    fr.campus.DonjonEtDragon.characters.Character playerChar;  // Le personnage du joueur
    private ArrayList<Case> plateau;

    // Constructeur qui prend un personnage
    public Game(Character playerChar) {
        this.playerChar = playerChar;
    }

    public ArrayList createPlateau() {
        Opponent gobelin = new Gobelin();
        Opponent dragon = new Dragon();
        this.plateau = new ArrayList<>(Collections.nCopies(64, new EmptyCase()));

        placeObjectsRandomly(dragon, 4);
        placeObjectsRandomly(gobelin, 6);
        //placeObjectsRandomly(new fr.campus.DonjonEtDragon.equipements.Potion(10), 5);


        return plateau;
    }

    private void placeObjectsRandomly(Case obj, int count) {
        List<Integer> availablePositions = new ArrayList<>();
        for (int i = 0; i < plateau.size(); i++) {
            if (plateau.get(i) instanceof EmptyCase) {
                availablePositions.add(i);  // Récupérer les positions des cases vides
            }
        }

        Collections.shuffle(availablePositions);  // Mélanger les positions

        for (int i = 0; i < count && !availablePositions.isEmpty(); i++) {
            int randomIndex = availablePositions.remove(0);  // Prendre une position aléatoire
            plateau.set(randomIndex, obj);  // Placer l'objet à cette position
        }
    }

    public void moovPlateau() {

        System.out.println(" ',                                                            ,'\n" +
                "       ',                                                        ,'\n" +
                "         ',          BIENVENUE DANS LE TERRIBLE MONDE ...      ,'\n" +
                "           :,              DE DONJON ET DRAGON !!             ,:\n" +
                "           : :,____________________________________________,: :\n" +
                "           : :-:       ..........        ..........       :-: :\n" +
                "           : :-:                  `.    .'                :-: :\n" +
                "           : :-:    dHHHHHHHHHHHb        dHHHHHHHHHHHb    :-: :\n" +
                "           : :-:   dHHHHHHHHHHHHHb      dHHHHHHHHHHHHHb   :-: :\n" +
                "           : :-:   HHHHHHHHHHHHHHH      HHHHHHHHHHHHHHH   :-: :\n" +
                "           : :-:   `HHHHHHHHHHHHHF      \"HHHHHHHHHHHHHF   :-: :\n" +
                "           : :-:    `HHHHHHHHHF\"\".\".oo.\".\"\"`HHHHHHHHHF    :-: :\n" +
                "           : :-:\".            ..\".dHHHHb.\"..            .\":-: :\n" +
                "           : :-:  \"\"...   ..\"\"   HHHF\"HHH   \"\"..   ...\"\"  :-: :\n" +
                "           : :-:     / \"\"\"/      \"HF  \"HF      \\\"\"\" \\     :-: :\n" +
                "           : :-:    /  .    ..              ..    .  \\    :-: :\n" +
                "           : :/:    :.\" \".\"\"/\\\"............\"/\\\"\".\" \".:    :\\: :\n" +
                "           : :/:     :   :\\/::\\/\\/\\/^^\\/\\/\\/::\\/:   :     :\\: :\n" +
                "           : :/:     :   ::::/^^^^^^^^^^^^^^\\::::   :     :\\: :\n" +
                "           : :/:     :   :::/^^^^^^^^^^^^^^^^\\:::   :     :\\: :\n" +
                "           : :/:     :   ::/^^^^^^^^^^^^^^^^^^\\::   :     :\\: :\n" +
                "           : :/:     :   :/^^^^^^^^^^^^^^^^^^^^\\:   :     :\\: :\n" +
                "           : :/:     `.  :AAAAAAAAAAAAAAAAAAAAAA:  .'     :\\: :\n" +
                "           : :/:     ::`:'                      `:' :     :\\: :\n" +
                "           : :/:     ::AAAAAAAAAAAAAAAAAAAAAAAAAAAA :     :\\: :\n" +
                "           : :/:_____:/                            \\:_____:\\: :\n" +
                "           : :/:AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\: :\n" +
                "           : ://                                          \\\\: :\n" +
                "           : :/                                            \\: :\n" +
                "           :  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  :\n" +
                "           : /                                              \\ :\n" +
                "           :/                                                \\:\n" +
                "            AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                "" + "");

        System.out.println("Appuyez sur 'Entrée' pour avancer sur le plateau");


        for (int i = 0; i < plateau.toArray().length; i++) {
            new java.util.Scanner(System.in).nextLine();
            playerPosition += 1;
            Case currentCase = plateau.get(i);
            currentCase.interact(playerChar);
            if (playerChar.getHealthLevelChar() == 0){
                break;
            }

            if (currentCase instanceof Opponent){
                Opponent curentEnnemi =(Opponent) currentCase;
                if(curentEnnemi.getHealth() == 0){
                    while (plateau.contains(curentEnnemi)) {
                        int indexEnnemi = plateau.indexOf(curentEnnemi);
                        plateau.set(indexEnnemi, new EmptyCase());
                    }
                }
            }

        }
    }
}



