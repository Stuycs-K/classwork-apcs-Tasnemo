public class ColorDemo {
  public static void main(String[]args) {
    for(int i = 30; i <109; i++) {
    System.out.print("\u001b[" + i +"m");
    System.out.print("Wo");
    if (i ==48) {
      i += 42;
    }
    }
}

public static void color(int foreground,int background){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
}

public static void color(int foreground, int background, int modifier){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
}
}
