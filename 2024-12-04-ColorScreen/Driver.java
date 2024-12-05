import java.util.Random;

public class Driver {

    public static final int SCREEN_WIDTH = 80;
    public static final int SCREEN_HEIGHT = 30;

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        drawBorder();
        int[] randomNumbers = generateRandomNumbers(3);
        displayRandomNumbers(randomNumbers);
        drawSeparator();
        drawInMiddle();

        Text.go(SCREEN_HEIGHT + 1, 1);
        System.out.print(Text.RESET);
    }

    public static void drawBorder() {
        for (int col = 1; col <= SCREEN_WIDTH; col++) {
            Text.go(1, col);
            Text.color(Text.WHITE, Text.background(Text.BLUE), Text.BRIGHT);
            System.out.print("#");

            Text.go(SCREEN_HEIGHT, col);
            Text.color(Text.WHITE, Text.background(Text.BLUE), Text.BRIGHT);
            System.out.print("#");
        }

        for (int row = 1; row <= SCREEN_HEIGHT; row++) {
            Text.go(row, 1);
            Text.color(Text.WHITE, Text.background(Text.BLUE), Text.BRIGHT);
            System.out.print("#");

            Text.go(row, SCREEN_WIDTH);
            Text.color(Text.WHITE, Text.background(Text.BLUE), Text.BRIGHT);
            System.out.print("#");
        }
    }

    public static int[] generateRandomNumbers(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public static void displayRandomNumbers(int[] numbers) {
        int spacing = SCREEN_WIDTH / (numbers.length + 1);
        for (int i = 0; i < numbers.length; i++) {
            int col = (i + 1) * spacing;
            Text.go(2, col);

            if (numbers[i] < 25) {
                Text.color(Text.RED, Text.BRIGHT);
            } else if (numbers[i] > 75) {
                Text.color(Text.GREEN, Text.BRIGHT);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }

    public static void drawSeparator() {
        for (int col = 2; col < SCREEN_WIDTH; col++) {
            Text.go(3, col);
            Text.color(Text.WHITE, Text.background(Text.BLUE));
            System.out.print("-");
        }
    }

    public static void drawInMiddle() {
        int midRow = SCREEN_HEIGHT / 2;
        int midCol = SCREEN_WIDTH / 2 - 6;

        Text.go(midRow, midCol);
        Text.color(Text.MAGENTA, Text.background(Text.CYAN), Text.BRIGHT);
        System.out.print("Hello, World!");
    }
}
