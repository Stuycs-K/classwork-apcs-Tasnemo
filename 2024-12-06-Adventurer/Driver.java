import java.util.Scanner;
import java.util.Random;

public class Driver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rng = new Random();

    CodeWarrior you = new CodeWarrior("Player");
    CodeWarrior rival = new CodeWarrior("Rival");
    boolean stillPlaying = true;

    while (stillPlaying) {
      System.out.println(you + ": " + you.getHP() + "/" + you.getmaxHP() + " HP, "
          + you.getSpecial() + "/" + you.getSpecialMax() + " " + you.getSpecialName());
      System.out.println(rival + ": " + rival.getHP() + "/" + rival.getmaxHP() + " HP, "
          + rival.getSpecial() + "/" + rival.getSpecialMax() + " " + rival.getSpecialName());

      System.out.println("Your move: (a)ttack / (sp)ecial / (su)pport / quit");
      String choice = input.nextLine().toLowerCase();

      if (choice.equals("quit")) {
        System.out.println("Game over! You decided to stop.");
        stillPlaying = false;
      } else if (choice.equals("a")) {
        System.out.println("You dealt " + Integer.parseInt(you.attack(rival)) + " damage to your rival.");
      } else if (choice.equals("sp")) {
        System.out.println(
            "You unleashed your special attack for " + Integer.parseInt(you.specialAttack(rival)) + " damage!");
      } else if (choice.equals("su")) {
        System.out.println("You restored " + Integer.parseInt(you.support()) + " energy points.");
      } else {
        System.out.println("Not a valid choice, try again.");
      }

      if (stillPlaying && rival.getHP() <= 0) {
        System.out.println("You defeated your rival! Great job!");
        stillPlaying = false;
      }

      if (stillPlaying) {
        int rivalMove = rng.nextInt(3);
        if (rivalMove == 0) {
          System.out.println("Your rival hit you for " + Integer.parseInt(rival.attack(you)) + " damage.");
        } else if (rivalMove == 1) {
          System.out.println(
              "Your rival used a special attack for " + Integer.parseInt(rival.specialAttack(you)) + " damage.");
        } else {
          System.out.println("Your rival restored " + Integer.parseInt(rival.support()) + " energy points.");
        }

        if (you.getHP() <= 0) {
          System.out.println("You were defeated by your rival. Better luck next time!");
          stillPlaying = false;
        }
      }
    }

    System.out.println("Thanks for playing!");
    input.close();
  }
}
