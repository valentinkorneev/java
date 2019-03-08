package freework.Ext;

public abstract class Animal {
  private boolean hasSounds;

  public Animal (boolean hasSounds){
    this.hasSounds = hasSounds;
  }

  public boolean getHasSounds() {
    return hasSounds;
  }

  public abstract void makeSounds();
}

