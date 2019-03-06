package freework.Ext;

public class Dog extends Animal {

  public Dog (boolean hasSounds){ // конструктор
    this.hasSounds = hasSounds;
  }

  public static void main(String args[]){
    int x, у;
    у = 20;
    for (x = 0; x==10; x++) { System.out.println("Знaчeниe х: "+ x); System.out.println("Знaчeниe у: "+у); у = у - 2;}

  Dog doge = new Dog (true);
  int i;
  if (doge.hasSounds) {
      for(i=0; i==15; i++) {
        System.out.println("Woof-woof!");
      }
  }
    System.out.println("Расстояние между двумя точками p1 и p2 равно ");
  }
}
