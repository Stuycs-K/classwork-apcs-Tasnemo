public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt( (a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println(p3);
    System.out.println("Distance (p1 to p2): " + distance(p1,p2));
    System.out.println("Distance (p1 to p2): " + Point.distance(p1,p2));
    System.out.println("Distance (p1 to p2): " + p1.distanceTo(p2));
    Point p4 = new Point(0, 0);
    Point p5 = new Point(0, 1);
    Point p6 = new Point(1, 0);

    System.out.println("Distance (p1 to p4): " + p1.distanceTo(p4));
    System.out.println("Distance (p2 to p5): " + p2.distanceTo(p5));
    System.out.println("Distance (p4 to p5): " + p4.distanceTo(p5));
    System.out.println("Distance (p4 to p6): " + p4.distanceTo(p6));
    System.out.println("Distance (p5 to p6): " + p5.distanceTo(p6));
    
    // equilateral triangle
    Point tA = new Point(0,0);
    Point tB = new Point(1,0);
    Point tC = new Point(.5,Math.sqrt(3)/2);
    System.out.println("Length AB: " + tA.distanceTo(tB));
    System.out.println("Length BC: " + tB.distanceTo(tC));
    System.out.println("Length CA: " + tC.distanceTo(tA));
  }
}
