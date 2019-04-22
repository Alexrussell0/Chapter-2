import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {

        final int DOZEN = 12;
        final double PRICE_DOZEN = 3.25;
        final double PRICE_EACH = 0.45;
        int eggsOrdered;
        int dozens;
        int leftOver;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs would you like? >>");
        eggsOrdered = input.nextInt();

        dozens = eggsOrdered /12;
        leftOver = eggsOrdered % 12;

        total = PRICE_DOZEN * dozens + leftOver * PRICE_EACH;

        System.out.println("You ordered" +  eggsOrdered +
                "eggs. That's" + dozens + "dozen at" + );

    }
}
