// In the last step, we overrode the getName() method. It printed "The Mighty " in addition to the anme instead of just the name.


// Looks like the bird to Animal didn't work since Animal is the super and that would mean there are necessary parameters missing

public class Driver {
  public static void main(String args[]) {
    Animal dog = new Animal("bark", 7, "Cookie");
    dog.speak();

    Bird bigbird = new Bird("caw", 15, "bigbird", 6, "yellow");
    bigbird.speak();

    Animal a1 = new Animal("bark", 7, "Cookie");
    Bird b1 = new Bird("coo", 12, "elmo", 7, "red");
    //Bird b2 = new Animal("woof", 6, "Cake");
    Animal a2 = new Bird("cacaw", 14, "eagle", 8, "black");
  }
}
