public class MyArrays {
  public static String arrayToString(int[] ary) {
      if (ary.length == 0) return "[]";
      String fin = "[";
      for (int i = 0; i < ary.length - 1; i++) {
          fin += ary[i] + ", ";
      }
      fin += ary[ary.length - 1] + "]";
      return fin;
  }

  public static int[] returnCopy(int[] ary) {
      int[] copy = new int[ary.length];
      for (int i = 0; i < ary.length; i++) {
          copy[i] = ary[i];
      }
      return copy;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
      int[] concatted = new int[ary1.length + ary2.length];
      for (int i = 0; i < ary1.length; i++) {
          concatted[i] = ary1[i];
      }
      for (int i = 0; i < ary2.length; i++) {
          concatted[ary1.length + i] = ary2[i];
      }
      return concatted;
  }

  public static void main(String[] args) {
      int[][] testArrays = {
          {1, 2, 3},   
          {5},         
          {7, 8, 9, 10}, 
          {0, -1, 2}   
      };

      for (int[] test : testArrays) {
          int[] copy = returnCopy(test);
          System.out.println("Original: " + arrayToString(test) + " | Copy: " + arrayToString(copy));
      }

      int[][] array1Tests = {
          {1, 2, 3},                  
          {5},             
          {7, 8, 9, 10},   
          {0, -1}          
      };

      int[][] array2Tests = {
          {4, 5, 6},             
          {2},             
          {11, 12},       
          {3, 4}          
      };

      for (int i = 0; i < array1Tests.length; i++) {
          int[] concatenated = concatArray(array1Tests[i], array2Tests[i]);
          System.out.println("Array1: " + arrayToString(array1Tests[i]) + 
                             " | Array2: " + arrayToString(array2Tests[i]) + 
                             " | Concatenated: " + arrayToString(concatenated));
      }
  }
}
