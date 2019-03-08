package freework.Ext;

public class Dog extends Animal {

  public Dog (boolean hasSounds){ // конструктор
    super(hasSounds);
  }

  public static void main(String args[]){

  Dog doge = new Dog (true);

      for(int i=0; i<15; i++) {
        if(doge.getHasSounds())
        System.out.println("Woof-woof!");
      }

    System.out.println("Расстояние между двумя точками p1 и p2 равно ");
  }
}
