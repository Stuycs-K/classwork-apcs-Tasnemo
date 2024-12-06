import java.util.Random;
public class Wizard extends Adventurer {
  private String special = "mana";
  private int specialMax = 10;
  private int specialQ = 10;

  public String getSpecialName() {
    return special;
  }
  public int getSpecial() {
      return specialQ;
    }
    public int getSpecialMax() {
      return SpecialMax;
    }
  public void setSpecial(int n) {
    if( n !> getSpecialMax()) {
    specialQ = n;
  }

public String attack(Adventurer other) {
  other.setHP(other.getHP() - 1) 
}

//heall or buff the target adventurer
public String support(Adventurer other);

//heall or buff self
public String support();

//hurt or hinder the target adventurer, consume some special resource
public String specialAttack(Adventurer other);

}
