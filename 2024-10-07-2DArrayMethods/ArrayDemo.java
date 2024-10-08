import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] array1D = {1, 2, 3};
    int[][] array2D = {{1, 2}, {3, 4}};
    System.out.println("arrToString 1D: " + arrToString(array1D) + "Expected:" + Arrays.toString(array1D));
    System.out.println("arrToString 2D: " + arrToString(array2D) + "Expected:" +Arrays.deepToString(array2D));

    int[][] countZerosTest1 = {{1, 0}, {0, 2}};
    int[][] countZerosTest2 = {{0, 0}, {0, 0}};
    int[][] countZerosTest3 = {{1, 2}, {3, 4}};
    System.out.println("Count zeros in array1: " + countZeros2D(countZerosTest1) + " (Expected: 2)");
    System.out.println("Count zeros in array2: " + countZeros2D(countZerosTest2) + " (Expected: 4)");
    System.out.println("Count zeros in array3: " + countZeros2D(countZerosTest3) + " (Expected: 0)");

    int[][] sumTest1 = {{1, 2}, {3, 4}};
    int[][] sumTest2 = {{-1, -2}, {-3, -4}};
    int[][] sumTest3 = {{0, 0}, {0, 0}};
    System.out.println("Sum of array1: " + arr2DSum(sumTest1) + " (Expected: 10)");
    System.out.println("Sum of array2: " + arr2DSum(sumTest2) + " (Expected: -10)");
    System.out.println("Sum of array3: " + arr2DSum(sumTest3) + " (Expected: 0)");

    int[][] replaceTest1 = {{1, -2}, {-3, 4}};
    int[][] replaceTest2 = {{-1, 2}, {3, -4}};
    replaceNegative(replaceTest1);
    replaceNegative(replaceTest2);
    System.out.println("After replaceNegative on array1: " + arrToString(replaceTest1) + " (Expected: [[1, 0], [1, 4]])");
    System.out.println("After replaceNegative on array2: " + arrToString(replaceTest2) + " (Expected: [[1, 2], [3, 1]])");

    int[][] original = {{1, 2}, {3, 4}};
    int[][] copied = copy(original);
    System.out.println("Copied array: " + arrToString(copied) + " (Expected: [[1, 2], [3, 4]])");
    original[0][0] = 10;
    System.out.println("Original after modification: " + arrToString(original) + " (Expected: [[10, 2], [3, 4]])");
    System.out.println("Copied should remain unchanged: " + arrToString(copied) + " (Expected: [[1, 2], [3, 4]])");

    int[][] swapTest1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] swapTest2 = {{1, 2}, {3, 4}, {5, 6}};
    int[][] rotated1 = swapRC(swapTest1);
    int[][] rotated2 = swapRC(swapTest2);
    System.out.println("Rotated array1: " + arrToString(rotated1) + " (Expected: [[1, 4], [2, 5], [3, 6]])");
    System.out.println("Rotated array2: " + arrToString(rotated2) + " (Expected: [[1, 3, 5], [2, 4, 6]])");

    int[][] htmlTest1 = {{1, 2}, {3, 4}};
    int[][] htmlTest2 = {{1}, {2}, {3}};
    System.out.println("HTML Table for array1: " + htmlTable(htmlTest1) + " (Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td><td>4</td></tr></table>)");
    System.out.println("HTML Table for array2: " + htmlTable(htmlTest2) + " (Expected: <table><tr><td>1</td></tr><tr><td>2</td></tr><tr><td>3</td></tr></table>)");

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s = "[";
    for (int i = 0; i < ary.length; i++){
      s = s + arrToString(ary[i]);
      if (i< ary.length-1) {
        s += ", ";
    }
  }
  return s;
}
  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count =0;
    for(int i =0; i < nums.length;i++) {
      for (int n=0; n < nums[i].length ; n = n+1) {
        if (nums[n][i] == 0) {
          count ++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i =0; i < nums.length;i++) {
      for (int n=0; n < nums[i].length;n++) {
        if (nums[n][i] == 0) {
          sum += nums[n][i];
        }
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
        for (int j = 0; j < vals[i].length; j++) {
            if (vals[i][j] < 0) {
                vals[i][j] = (i == j) ? 1 : 0;
            }
        }
    }
}

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums) {
    int[][] copy = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
        copy[i] = new int[nums[i].length];
        for (int j = 0; j < nums[i].length; j++) {
            copy[i][j] = nums[i][j];
        }
    }
    return copy;
}
  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums) {
    int[][] rotated = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[i].length; j++) {
            rotated[j][i] = nums[i][j];
        }
    }
    return rotated;
}

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][] nums) {
    StringBuilder sb = new StringBuilder("<table>");
    for (int i = 0; i < nums.length; i++) {
        sb.append("<tr>");
        for (int j = 0; j < nums[i].length; j++) {
            sb.append("<td>").append(nums[i][j]).append("</td>");
        }
        sb.append("</tr>");
    }
    sb.append("</table>");
    return sb.toString();
}
}

