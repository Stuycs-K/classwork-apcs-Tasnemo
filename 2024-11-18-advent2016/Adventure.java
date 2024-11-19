import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Adventure {

    private ArrayList<String> instructions;
    private int x, y;
    private String currentDirection;

    public Adventure(ArrayList<String> instructions) {
        this.instructions = instructions;
        this.x = 0;
        this.y = 0;
        this.currentDirection = "N"; // Initially facing North
    }

    public void turnLeft() {
        // Turn left from the current direction
        if (currentDirection.equals("N")) {
            currentDirection = "W";
        } else if (currentDirection.equals("W")) {
            currentDirection = "S";
        } else if (currentDirection.equals("S")) {
            currentDirection = "E";
        } else if (currentDirection.equals("E")) {
            currentDirection = "N";
        }
    }

    public void turnRight() {
        // Turn right from the current direction
        if (currentDirection.equals("N")) {
            currentDirection = "E";
        } else if (currentDirection.equals("E")) {
            currentDirection = "S";
        } else if (currentDirection.equals("S")) {
            currentDirection = "W";
        } else if (currentDirection.equals("W")) {
            currentDirection = "N";
        }
    }

    public void moveForward(int steps) {
        // Move forward the specified number of steps in the current direction
        if (currentDirection.equals("N")) {
            y += steps;
        } else if (currentDirection.equals("E")) {
            x += steps;
        } else if (currentDirection.equals("S")) {
            y -= steps;
        } else if (currentDirection.equals("W")) {
            x -= steps;
        }
    }

    public int run() {
        // Process each instruction in the sequence
        for (String instruction : instructions) {
            char turn = instruction.charAt(0);  // First character (L or R)
            int steps = Integer.parseInt(instruction.substring(1));  // Remaining part is the number of steps

            if (turn == 'L') {
                turnLeft();
            } else if (turn == 'R') {
                turnRight();
            }

            moveForward(steps);
        }

        // Return the Manhattan distance
        return Math.abs(x) + Math.abs(y);
    }

    public static ArrayList<String> readInstructionsFromFile(String filename) {
        ArrayList<String> instructions = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            // Read the single line from the file
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Instructions are expected to be comma-separated
                instructions = Array.asList(line.split(", "));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return instructions;
    }
}