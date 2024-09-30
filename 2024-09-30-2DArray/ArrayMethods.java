//1. Write both your names + emails at the top of the document as a comment.
// Sophia Jin sjin60@stuy.edu sophiaj44@nycstudents.net Tasnim Islam tislam50@stuy.edu tasnimi6@nycstudent.net
//2. Copy your arrToString method from before.

/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[]ary){
  String s = "[";
  for (int i = 0; i < nums.length - 1; i++ ){
          s += nums[i];
          s += ", ";

  }
  s += nums[nums.length - 1] ;
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
    return ans+"]";
  }
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  return null;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}