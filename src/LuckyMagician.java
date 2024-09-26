import java.util.Random;

public class LuckyMagician extends Magician{
    int luckyCase;

    public LuckyMagician(String name) {
        super(name);
        this.luckyCase = new Random().nextInt(2, 65); // Une case entre 2 et 64
        System.out.println("Your winning position is: " + luckyCase);
    }

    public int getWinningPosition() {
        return luckyCase;
    }
}
