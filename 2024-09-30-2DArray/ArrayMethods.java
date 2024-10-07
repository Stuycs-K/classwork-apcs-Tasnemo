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
  
    test = new int[][] {{1,2,-3}, {4,5,6},{7,8,9}};
    System.out.println(arrToString(swapRC(test)));
    test = new int[][] {{1,3,5}, {1,2,4},{5,6,7}};
    System.out.println(arrToString(swapRC(test)));
  
    test = new int[][] {{1, 2, -3}, {4, 5, 6}, {7, 8, 9}};
    int[][] copiedTest1 = copy(test);
    System.out.println("Original: " + arrToString(test));
    System.out.println("Copy: " + arrToString(copiedTest1));

    test[0][0] = 10;
    System.out.println("After mod:");
    System.out.println("Original: " + arrToString(test));
    System.out.println("Copy: " + arrToString(copiedTest1));

    test = new int[][] {{1, 3, 5}, {1, 2, 4}, {5, 6, 7}};
    int[][] copiedTest2 = copy(test);
    System.out.println("Original: " + arrToString(test));
    System.out.println("Copy: " + arrToString(copiedTest2));

    test[1][1] = 20;
    System.out.println("After mod:");
    System.out.println("Original: " + arrToString(test));
    System.out.println("Copy: " + arrToString(copiedTest2));
  
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
    for (int n = 0; n <nums[i].length; n++) {
      sum += nums[i][n];
    }
  }

  return sum;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int[][] copy= new int[nums[0].length][nums.length];
  for(int i = 0; i < nums[0].length; i++) {
    for (int n = 0; n < nums.length; n++) {
      copy[i][n] = nums[n][i];
    }
  }
  return copy;
}

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){ 
  for(int i = 0; i < vals[0].length; i++) {
    for (int n = 0; n < vals.length; n++) {
      if (vals[n][i] < 0) {
        if (n == i) {
          vals[n][i] = 1;
        } else {
          vals[n][i] = 0;
        }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[] copy(int[] nums) {
  int[] copy = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    copy[i] = nums[i];
  }
  return copy;
}
public static int[][] copy(int[][] nums){
  int[][] copy = new int[nums.length][nums[0].length];
  for (int i = 0; i < nums.length; i++) {
    copy[i] = copy(nums[i]);

  }
  return copy;
}
}

