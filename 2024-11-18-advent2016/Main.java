import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read instructions from input.txt using Scanner
        List<String> instructions = Adventure.readInstructionsFromFile("input.txt");

        // Create an instance of the Adventure class with the instructions
        Adventure adventure = new Adventure(instructions);

        // Run the adventure and output the result
        int distance = adventure.run();
        System.out.println("The shortest distance to the destination is " + distance + " blocks.");
    }
}
