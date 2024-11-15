import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(2));
    ArrayList<String> release = ArrayListPractice.createRandomArray(10);
    ArrayList<String> release2 = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(release);
    System.out.println(release);
    System.out.println(ArrayListPractice.makeReversedList(release));
    System.out.println(release);
    System.out.println(release2);
    System.out.println(ArrayListPractice.mixLists(release, release2));

  }
}
