//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);

        System.out.println("Hi ! Do you want to create a new character ? (type true (create) or false (quit).");
        boolean newChar = myScan.nextBoolean();
if (newChar) {
    Menu.main(args);
} else {
    System.out.println("Bye bye !");
}
}
}