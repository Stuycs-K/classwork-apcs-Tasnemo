import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


public class Adventure {

 public static String[] parse(String filename) {
   try {
       File file = new File(filename);
       Scanner input = new Scanner(file);
       String line = input.nextLine();
      input.close();
       String[] dirs = line.split(", ");



     }
   catch (FileNotFoundException ex) {
       System.out.println("File not found");
   }
   return null;
 }

 public static int travel(String[] instruc) {
   int x = 0;
   int y = 0;
   int O = 0;
   int[][] oreo =  {
   {0,1}, {1,0}, {0,-1}, {-1,0}};
   int[] travels = new int[instruc.length()/2];
   String[] turns = new String[instruc.length(/2)];
   for( int i = 0; i < instruc.length(); i++) {}

   return 0;
 }

}
