package org.velezreyes.quiz.question6;

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
      if (quarters < ScottCola.price) {
        throw new NotEnoughMoneyException();
      }
      Drink drink = new ScottCola();
      quarters -= ScottCola.price;
      return drink;
    }
    if (name.equals("KarenTea")) {
      if (quarters < KarenTea.price) {
        throw new NotEnoughMoneyException();
      }
      Drink drink = new KarenTea();
      quarters -= KarenTea.price;
      return drink;
    }
    throw new UnknownDrinkException();
  }
}
