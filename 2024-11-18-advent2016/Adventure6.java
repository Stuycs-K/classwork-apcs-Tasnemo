import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adventure6 {

    public static ArrayList<String> parse(String filename) {
        try {
            ArrayList<String> data = new ArrayList<>();
            Scanner input = new Scanner(new File(filename));

            while (input.hasNextLine()) {
                data.add(input.nextLine());
            }

            input.close();
            return data;

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        return null;
    }

    public static String findMessage(String filename) {
        ArrayList<String> input = parse(filename);
        if (input == null || input.isEmpty()) {
            return "";
        }

        int length = input.get(0).length();
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int[] count = new int[26];

            for (String line : input) {
                char c = line.charAt(i);
                count[c - 'a']++;
            }

            char mostFrequent = ' ';
            int maxCount = -1;

            for (char c = 'a'; c <= 'z'; c++) {
                if (count[c - 'a'] > maxCount) {
                    mostFrequent = c;
                    maxCount = count[c - 'a'];
                }
            }

            message.append(mostFrequent);
        }

        return message.toString();
    }

    public static void main(String[] args) {
        System.out.println("Error-corrected message: " + findMessage("input.txt"));
    }
}
