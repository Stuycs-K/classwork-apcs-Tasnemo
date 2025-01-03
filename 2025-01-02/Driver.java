public class Driver {
  public static void main (String[] args) {
  ///System.out.println(fib(Integer.parseInt(args[0])));
  makeWords(Integer.parseInt(args[0]),"", args[1]);
  }
  public static int fib( int ind) {
    if (ind == 0)  return 0;
    if (ind == 1)  return 1;
    return fib(ind-1) + fib(ind-2);


  }


  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0) {
      System.out.println(result);
    } else {
      for (int i = 0; i < alphabet.length(); i ++) {
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }

    }

}
  public static String toWords(int n)  {
    return null;
  }
}
