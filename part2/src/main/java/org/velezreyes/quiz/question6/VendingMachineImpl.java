package org.velezreyes.quiz.question6;

import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {

  private int quarters = 0; // 25 cents

  private static VendingMachineImpl instance;

  private VendingMachineImpl() {
  }

  public static VendingMachine getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
    quarters++;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (quarters == 0) {
      throw new NotEnoughMoneyException();
    }
    if (name.equals("ScottCola")) {
      if (quarters < 3) {
        throw new NotEnoughMoneyException();
      }
      quarters -= 3;
      return new DrinkImpl(name, true);
    }
    if (name.equals("KarenTea")) {
      if (quarters < 4) {
        throw new NotEnoughMoneyException();
      }
      quarters -= 4;
      return new DrinkImpl(name, false);
    }
    throw new UnknownDrinkException();
  }
}
