import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(2));
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(1000000);
    System.out.println(ArrayListPractice.replaceEmpty(test1));

  }
}
