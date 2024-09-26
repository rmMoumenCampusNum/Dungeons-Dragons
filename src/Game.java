import java.util.Random;

public class Game {
    int playerPosition = 1;
    int maxCase = 64;
    Character playerChar;  // Le personnage du joueur


    // Constructeur qui prend un personnage
    public Game(Character playerChar) {
        this.playerChar = playerChar;
    }

    public void startGame() {
        Random random = new Random();

        // Boucle de jeu
        while (playerPosition < maxCase) {
            System.out.println("Player is on position: " + playerPosition);
            System.out.println("Press enter to roll the dice...");

            // Pause pour que le joueur puisse lancer le dé
            new java.util.Scanner(System.in).nextLine();

            // Lancer le dé (de 1 à 6)
            int dice = random.nextInt(6) + 1;
            System.out.println("You rolled a " + dice);

            // Calculer la nouvelle position
            int newPosition = playerPosition + dice;

            // Vérifier si le joueur dépasse la case 64
            if (newPosition > maxCase) {
                try {
                    throw new Erreur("Player out of cases.");
                } catch (Erreur e) {
                    System.out.println("You've rolled too high and exceeded the board limit, roll again.");
                }
            } else {
                playerPosition = newPosition;
            }

            if (playerPosition == 64){
                // Fin du jeu
                System.out.println("Congratulations! You reached the final position: " + maxCase);
            }
            if (playerChar instanceof LuckyMagician) {
                LuckyMagician luckyMagician = (LuckyMagician) playerChar;
                if (playerPosition == luckyMagician.getWinningPosition()) {
                    System.out.println("Congratulations! You've reached your winning position: " + playerPosition);
                    break; // Fin du jeu
                }
            }
        }
    }
}

