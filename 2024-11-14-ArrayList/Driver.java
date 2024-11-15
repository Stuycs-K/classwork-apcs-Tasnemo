import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(2));
    ArrayList<String> release = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(release);
    System.out.println(release);
    ArrayListPractice.makeReversedList(release);
    System.out.println(release);


  }
}
