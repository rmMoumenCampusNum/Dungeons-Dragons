import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;


public class Game {
    int playerPosition = 0;
    int maxCase = 64;
    Character playerChar;  // Le personnage du joueur
    private ArrayList<Case> plateau;

    // Constructeur qui prend un personnage
    public Game(Character playerChar) {
        this.playerChar = playerChar;
    }

    public ArrayList createPlateau() {
        this.plateau = new ArrayList<>();
        plateau.add(new Spell());
        plateau.add(new Shield());
        plateau.add(new Opponent("Gobelin", 10, 30));
        plateau.add(new Potion(10));

        return plateau;
    }

    public void moovPlateau() {

        while (playerPosition < plateau.toArray().length) {
            for (int i = 0; i < 4; i++) {
                new java.util.Scanner(System.in).nextLine();
                playerPosition += 1;
                System.out.println(plateau.get(i));
            }

        }
    }
}


//    public void startGame() {
//        Random random = new Random();
//
//        // Boucle de jeu
//        while (playerPosition < maxCase) {
//            System.out.println("Player is on position: " + playerPosition);
//            System.out.println("Press enter to roll the dice...");
//
//            // Pause pour que le joueur puisse lancer le dé
//            new java.util.Scanner(System.in).nextLine();
//
//            // Lancer le dé (de 1 à 6)
//            int dice = random.nextInt(6) + 1;
//            System.out.println("You rolled a " + dice);
//
//            // Calculer la nouvelle position
//            int newPosition = playerPosition + dice;
//
//            // Vérifier si le joueur dépasse la case 64
//            if (newPosition > maxCase) {
//                try {
//                    throw new Erreur("Player out of cases.");
//                } catch (Erreur e) {
//                    System.out.println("You've rolled too high and exceeded the board limit, roll again.");
//                }
//            } else {
//                playerPosition = newPosition;
//            }
//
//            if (playerPosition == 64){
//                // Fin du jeu
//                System.out.println("Congratulations! You reached the final position: " + maxCase);
//            }
//            if (playerChar instanceof LuckyMagician luckyMagician) {
//                if (playerPosition == luckyMagician.getWinningPosition()) {
//                    System.out.println("Congratulations! You've reached your winning position: " + playerPosition);
//                    break; // Fin du jeu
//                }
//            }
//        }
//    }


