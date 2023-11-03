package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    
  private final String name;
  private final boolean isFizzy;
  
  public DrinkImpl(String name, boolean isFizzy) {
    this.name = name;
    this.isFizzy = isFizzy;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
  @Override
  public boolean isFizzy() {
    return isFizzy;
  }
}
  