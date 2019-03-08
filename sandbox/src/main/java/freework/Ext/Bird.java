package freework.Ext;

public class Bird extends Animal{

  public Bird (boolean hasSounds){ // конструктор
    super(hasSounds);
  }


  public void makeSounds () {
    for(int i=0; i<15; i++) System.out.println("Ptuch-ptuch");
  }

}

