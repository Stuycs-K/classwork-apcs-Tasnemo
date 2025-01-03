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
            int[][] sides = new int[3][3];
            while (input.hasNextInt()) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (input.hasNextInt()) {
                            sides[i][j] = input.nextInt();
                        }
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (isValidTriangle(sides[0][j], sides[1][j], sides[2][j])) {
                        count++;
                    }
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
        int validTrianglesCountA = countTrianglesA("inputTri.txt");
        System.out.println("Count of valid triangles (Part A): " + validTrianglesCountA);

        int validTrianglesCountB = countTrianglesB("inputTri.txt");
        System.out.println("Count of valid triangles (Part B): " + validTrianglesCountB);
    }
}
