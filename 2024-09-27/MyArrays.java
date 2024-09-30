public class MyArrays {
    public static String arrayToString(int[] nums){
        String s = "[";
        for (int i = 0; i < nums.length - 1; i++ ){
                s += nums[i];
                s += ", ";
            
        }
        s += nums[nums.length - 1] ;
        return s + "}";

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
    for (int i = 0; i < concatted.length; i++) {
        if (i < ary1.length) {
            concatted[i] = ary1[i];
        } else {
            concatted[i] = ary2[i - ary1.length];
        }
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

      for (int i = 0; i < testArrays.length; i++) {
        int[] copy = returnCopy(testArrays[i]);
        System.out.println("Original: " + arrayToString(testArrays[i]) + " | Copy: " + arrayToString(copy));
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
