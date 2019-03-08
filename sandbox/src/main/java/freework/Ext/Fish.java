package freework.Ext;

public class Fish extends Animal {
  public Fish (boolean hasSounds){ // конструктор
    super(hasSounds);
  }

  @Override
  public void makeSounds() {
    if (!getHasSounds()) System.out.println("BullBull");
  }
}
