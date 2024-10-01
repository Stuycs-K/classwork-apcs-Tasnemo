public class ArrayMethods {
  public static void main(String[] args) {
    int[][] test = {{1,2,3}, {4,5,6}, {7,8,9}};
    System.out.println(arrToString(test));
    test = new int[][] {{1,3,5}, {1,2},{}};
    System.out.println(arrToString(test));

    test = new int[][] {{1,2,-3}, {4,5,6},{7,8,9}};
    System.out.println(arr2DSum(test));
    test = new int[][] {{1,3,5}, {1,2},{}};
    System.out.println(arr2DSum(test));
  

  
  }

//1. Write both your names + emails at the top of the document as a comment.
// Sophia Jin sjin60@stuy.edu sophiaj44@nycstudents.net Tasnim Islam tislam50@stuy.edu tasnimi6@nycstudent.net
//2. Copy your arrToString method from before.

/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[]ary){
  String s = "[";
  for (int i = 0; i < ary.length; i++ ){
          s += ary[i];
          if (i<ary.length-1) {
            s += ", ";
          }
  }
  return s + "]";
}


//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  String ans="[";
  for (int i=0; i<ary.length; i++) {
    ans+=arrToString(ary[i]);
    if (i<ary.length-1) {
      ans+=", ";
    }

  }
    return ans+"]";
}

/*Return the sum of all of the values in the 2D array */
//use a nested loop to solve this
public static int arr2DSum(int[][]nums){
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int n = 0; n nums[i].length; n++) {
      sum += nums[i][n]
    }
  }

  return sum;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}

}
