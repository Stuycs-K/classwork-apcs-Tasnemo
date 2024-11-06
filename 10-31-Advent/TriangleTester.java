import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
    public static int countTrianglesA(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextInt()) {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                if (isValidTriangle(a, b, c)) {
                    count++;
                }
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            }
            return count;
    }

    public static int countTrianglesB(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int[] sides = new int[3];
            while (input.hasNextInt()) {
                for (int i = 0; i < 3; i ++) {
                    if (input.hasNextInt()) {
                        sides[i] = input.nextInt();
                    }
                }
                if (isValidTriangle(sides[0], sides[1], sides[2])) {
                    count++;
                }
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return count;
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        int validTrianglesCount = countTrianglesB("inputTri.txt");
        System.out.println(validTrianglesCount);
    }
}
