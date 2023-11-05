package org.velezreyes.quiz.question6;

public class ScottCola implements Drink {
  private String name;
  private boolean isFizzy;
  public static int price = 3; // 3 quarters = 75 cents
  public ScottCola() {
    name = "ScottCola";
    isFizzy = true;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public boolean isFizzy(){
    return isFizzy;
  }
}
