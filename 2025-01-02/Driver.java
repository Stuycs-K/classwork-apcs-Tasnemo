public class Driver {
  public static void main (String[] args) {
    System.out.println(fib(Integer.parseInt(args[0])));
  }
  public static int fib( int ind) {
    if (ind == 0)  return 0;
    if (ind == 1)  return 1;
    return fib(ind-1) + fib(ind-2);
  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    

}
}
