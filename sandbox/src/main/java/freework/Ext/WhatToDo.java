package freework.Ext;

public class WhatToDo {

  public static void main(String args[]){

    Dog doge = new Dog (true);
    Bird birdie = new Bird (true);
    Wolf wolfie = new Wolf (true);
    Fish fishie = new Fish(false);

    for(int i=0; i<15; i++) {
      if(doge.getHasSounds())
        System.out.println("Woof-woof!");
    }

    doge.makeSounds();
    birdie.makeSounds();
    wolfie.makeSounds();
  }
}
