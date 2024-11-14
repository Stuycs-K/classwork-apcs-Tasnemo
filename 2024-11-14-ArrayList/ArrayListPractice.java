import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String> createRandomArray(int size) {
    ArrayList<String> RanArry = new ArrayList<String>(size);
    for (int i =0; i < size; i++){
      int num = (int) (11.0 * Math.random());
      if ( num == 0) {
        RanArry.add("");
      } else {
        RanArry.add("" +num);
      }
    p
    }
    return RanArry;
  }

}
