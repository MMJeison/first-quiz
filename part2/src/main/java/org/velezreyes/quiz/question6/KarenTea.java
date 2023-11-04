package org.velezreyes.quiz.question6;

public class KarenTea implements Drink {
  private String name;
  private boolean isFizzy;
  public static int price = 4; // 4 quarters = 1 dollar
  public KarenTea() {
    name = "KarenTea";
    isFizzy = false;
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
