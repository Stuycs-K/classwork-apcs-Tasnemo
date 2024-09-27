public class MyArrays {
  public static void arrayToString(int[]ary) {
    string fin ="["
    for(int i = 0; i +1 < ary.length; i++) {
    fin += ary[i];
    fin += ", ";
  }
    return fin + ary[ary.length -1] + "]" ;

  }

  public static int[] returnCopy(int[]ary) {

  }

  public static void main(string[]args) {
    arrayToString()
  }
}
