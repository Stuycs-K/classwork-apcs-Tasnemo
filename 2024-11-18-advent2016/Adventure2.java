import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adventure2 {
    public static ArrayList<String> parse(String filename) {
        try {
            ArrayList<String> instruc = new ArrayList<>();
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                instruc.add(line);
            }
            input.close();
            return instruc;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return null;
    }

    public static String codefinder(String filename) {
        ArrayList<String> lines = parse(filename);
        if (lines == null) {
            return "";
        }

        String code = "";
        int x = 1;
        int y = 1;
        int[][] keypad = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        for (int i = 0; i < lines.size(); i++) {
            String work = lines.get(i);
            for (int n = 0; n < work.length(); n++) {
                char move = work.charAt(n);
                if (move == 'U' && y > 0) {
                    y--;
                }
                if (move == 'D' && y < 2) {
                    y++;
                }
                if (move == 'R' && x < 2) {
                    x++;
                }
                if (move == 'L' && x > 0) {
                    x--;
                }
            }
            code += keypad[y][x];
        }
        return code;
    }

    public static void main(String[] args) {
        String result = codefinder("input.txt");
        System.out.println("Code: " + result);
    }
}
