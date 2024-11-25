import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Adventure2 {
     public static String[] parse(String filename) {
   try {
    ArrayList<String> instruc = new ArrayList<String>()
       File file = new File(filename);
       Scanner input = new Scanner(file);
       while (input.hasNextLine()) {
        String line = input.nextLine();
        instruc.add(line); // Add the line to the ArrayList
    }
       String line = input.nextLine();
      input.close();
       String[] dirs = line.split(", ");


        return dirs;
     }
   catch (FileNotFoundException ex) {
       System.out.println("File not found");
   }
   return null;
 }
}
