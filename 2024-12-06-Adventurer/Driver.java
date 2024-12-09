  import java.util.Scanner;
public class Driver {
  public static void main(String[] args) {
    boolean gameRun= true;
    int tester = 0;
    CodeWarrior Player1 = new CodeWarrior("p1", 15, "Engrish");
    CodeWarrior Player2 = new CodeWarrior("p2", 15, "Espanich");
    Scanner game = new Scanner(System.in);
    while(gameRun && tester < 4) {
    System.out.println(Player1.getName() + ", " + Player1.getHP() + "/" + Player1.getmaxHP() +", " + Player1.getSpecial() + "/" + Player1.getSpecialMax() + " " + Player1.getSpecialName());
    System.out.println(Player2.getName() + ", " + Player2.getHP() + "/" + Player2.getmaxHP() +", " + Player2.getSpecial() + "/" + Player2.getSpecialMax() + " " + Player2.getSpecialName());
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    boolean action = false;
    String command = userInput.nextLine();
    if (command.equals("a")) {
      Player1.attack(Player2);

    }
    if (command.equals("sp")) {

    }
    if (command.equals("q")){

    }
    tester += 1;
    }
}
}
