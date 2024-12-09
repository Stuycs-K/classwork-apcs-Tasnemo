import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adventure4 {
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

    public static int findSum(String filename) {
        ArrayList<String> input = parse(filename);
        if (input == null) return 0;

        int total = 0;

        for (String line : input) {
            int lastDash = line.lastIndexOf('-');
            int openBracket = line.indexOf('[');
            int id = Integer.parseInt(line.substring(lastDash + 1, openBracket));
            String name = line.substring(0, lastDash).replace("-", "");
            String checksum = line.substring(openBracket + 1, line.length() - 1);

            int[] count = new int[26];
            for (char c : name.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder check = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                char bestChar = ' ';
                int bestCount = -1;

                for (char c = 'a'; c <= 'z'; c++) {
                    if (count[c - 'a'] > bestCount || 
                       (count[c - 'a'] == bestCount && c < bestChar)) {
                        bestChar = c;
                        bestCount = count[c - 'a'];
                    }
                }
                check.append(bestChar);
                count[bestChar - 'a'] = -1;
            }

            if (check.toString().equals(checksum)) {
                total += id;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of sector IDs: " + findSum("input.txt"));
    }
}
