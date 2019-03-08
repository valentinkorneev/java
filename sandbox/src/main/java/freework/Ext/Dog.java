package freework.Ext;

public class Dog extends Animal {

  public Dog (boolean hasSounds){ // конструктор
    super(hasSounds);
  }


  public void makeSounds () {
    for(int i=0; i<15; i++) System.out.println("Woof");
  }


}
