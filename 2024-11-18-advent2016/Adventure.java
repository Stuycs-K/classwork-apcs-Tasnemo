import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Adventure {

 public static String[] parse(String filename) {
   try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       String line = input.nextLine();
      input.close();
       String[] dirs = line.split(", ");


        return dirs;
     }
   catch (FileNotFoundException ex) {
       System.out.println("File not found");
   }
   return null;
 }

 public static int travel(String filename) {
  String[] instruc = parse(filename);
   int x = 0;
   int y = 0;
   int O = 0;
   int[][] oreo =  {
   {0,1}, {1,0}, {0,-1}, {-1,0}};
   int[] travels = new int[instruc.length];
   String[] turns = new String[instruc.length];
   for( int i = 0; i < instruc.length; i++) {
     turns[i] = instruc[i].substring(0,1);
     System.out.println(turns[i]);
     travels[i] = Integer.parseInt(instruc[i].substring(1));
     System.out.println(travels[i]);
     if (turns[i].equals( "L")) {
      O -= 1;
     } else {
      O += 1;
     }

     O = (O + 4) % 4;
     x = x + oreo[O][0] * travels[i];
     y = y + oreo[O][1] * travels[i];
     System.out.println(x + "," + y);

   }


   return Math.abs(x) + Math.abs(y);
 }

}
