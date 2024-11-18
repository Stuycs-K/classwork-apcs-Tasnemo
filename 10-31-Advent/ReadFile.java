import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
            System.out.println(line);

      }
      input.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return;
    }
  }
}
