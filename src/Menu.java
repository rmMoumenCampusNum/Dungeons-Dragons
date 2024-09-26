import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please, enter a name for your character : ");
        String name = myScan.nextLine();

        System.out.println("Please, enter a type for your character ('Warrior', 'Magician', or 'LuckyMagician'): ");
        String type = myScan.nextLine();

        while (!type.equals("Warrior") && !type.equals("Magician") && !type.equals("LuckyMagician")) {
            System.out.println("Please choose a valid type for your character ('Warrior', 'Magician', or 'LuckyMagician')");
            type = myScan.nextLine();
        }

        // Création du personnage userChar
        Character userChar;
        if (type.equals("Warrior")) {
            userChar = new Warrior(name);
        } else if (type.equals("Magician")) {
            userChar = new Magician(name);
        } else { // type.equals("LuckyMagician")
            userChar = new LuckyMagician(name);
        }

        System.out.println("Welcome " + userChar.getNameChar() + ", what do you want to do ?");

        int choice = 0;
        while (choice != 1 && choice != 4) {
            showMenu();
            choice = myScan.nextInt();
            myScan.nextLine(); // Consommer la nouvelle ligne restante après nextInt()

            if (choice == 1) {
                // Démarrer le jeu
                System.out.println("Starting game...");
                Game game = new Game(userChar);  // Passer userChar au jeu
                game.startGame();  // Lancer le jeu

            } else if (choice == 2) {
                // Afficher les informations du personnage
                System.out.println("CHARACTER INFORMATIONS");
                System.out.println("Name : " + userChar.getNameChar());
                System.out.println("Type : " + userChar.getTypeChar());
                System.out.println("Health : " + userChar.getHealthLevelChar());
                System.out.println("Strength : " + userChar.getStrengthChar());
                System.out.println("Weapon : " + userChar.offensiveEquipement.getNameWeapon());
                System.out.println("Shield : " + userChar.defensiveEquipement.getNameShield());

            } else if (choice == 3) {
                // Modifier les informations du personnage
                System.out.println("CHARACTER SETTINGS");
                System.out.println("1. Change name");
                System.out.println("2. Change type");
                int setChoice = myScan.nextInt();
                myScan.nextLine(); // Consommer la nouvelle ligne restante après nextInt()

                if (setChoice == 1) {
                    // Changer le nom
                    System.out.println("Enter the new name of your Character : ");
                    String newName = myScan.nextLine();
                    userChar.setNameChar(newName);

                } else if (setChoice == 2) {
                    // Changer le type
                    System.out.println("Enter the new type of your Character : ");
                    String newType = myScan.nextLine();

                    userChar = switch (newType) {
                        case "Warrior" -> new Warrior(name);
                        case "Magician" -> new Magician(name);
                        case "LuckyMagician" -> new LuckyMagician(name);
                        default -> userChar;
                    };

                    userChar.setTypeChar(newType);


                } else {
                    System.out.println("Please, make a valid choice : ");

                }
            } else if (choice == 4) {
                // Quitter le programme
                System.out.println("Bye bye !");
            }
        }
    }

    public static void showMenu() {
        System.out.println("______________________________________");
        System.out.println("| 1. Play.                           |");
        System.out.println("______________________________________");
        System.out.println("| 2. Read infos of my character.     |");
        System.out.println("______________________________________");
        System.out.println("| 3. Set infos of my character.      |");
        System.out.println("______________________________________");
        System.out.println("| 4. Quit                            |");
        System.out.println("______________________________________");
    }
}
