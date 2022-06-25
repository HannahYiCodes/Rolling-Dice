import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random numberInput = new Random();
        int x = numberInput.nextInt(6) + 1;
        System.out.println("You rolled a: " + x);
    }
}