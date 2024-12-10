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
        String result = you.attack(rival);
        int damage = extractNumber(result);
        System.out.println("You dealt " + damage + " damage to your rival.");
      } else if (choice.equals("sp")) {
        String result = you.specialAttack(rival);
        int damage = extractNumber(result);
        System.out.println("You unleashed your special attack for " + damage + " damage!");
      } else if (choice.equals("su")) {
        String result = you.support();
        int restored = extractNumber(result);
        System.out.println("You restored " + restored + " energy points.");
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
          String result = rival.attack(you);
          int damage = extractNumber(result);
          System.out.println("Your rival hit you for " + damage + " damage.");
        } else if (rivalMove == 1) {
          String result = rival.specialAttack(you);
          int damage = extractNumber(result);
          System.out.println("Your rival used a special attack for " + damage + " damage.");
        } else {
          String result = rival.support();
          int restored = extractNumber(result);
          System.out.println("Your rival restored " + restored + " energy points.");
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

  public static int extractNumber(String input) {
    return Integer.parseInt(input.replaceAll("[^0-9]", ""));
  }
}
