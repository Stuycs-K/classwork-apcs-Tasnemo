import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(2));
<<<<<<< HEAD
    ArrayList<String> release = ArrayListPractice.createRandomArray(10);
    ArrayList<String> release2 = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(release);
    System.out.println(release);
    System.out.println(ArrayListPractice.makeReversedList(release));
    System.out.println(release);
    System.out.println(release2);
    System.out.println(ArrayListPractice.mixLists(release, release2));
=======
    ArrayList<String> test1 = ArrayListPractice.createRandomArray(1000000);
    System.out.println(ArrayListPractice.replaceEmpty(test1));
>>>>>>> deb7d1811d241574b80c79b04679c804465ba1dc

  }
}
