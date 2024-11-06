import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner("Some String (or File) Here")) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }

        try (Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2")) {
            double sum = 0;
            while (sc2.hasNextDouble()) {
                sum += sc2.nextDouble();
            }
            System.out.println("Sum of doubles: " + sum);
        }
    }
}
