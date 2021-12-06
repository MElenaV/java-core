package ru.gb.meshch.hw3;

import java.util.ArrayList;

public class BoxFruit<F> {
  ArrayList<F> fruits = new ArrayList();
  private double weight = 0.0;

  public <F> BoxFruit(double weight) {
    this.weight = weight;
  }

  public double getBoxWeight() {
    return weight * fruits.size();
  }

  public void addFruit(F fruit) {
    fruits.add(fruit);
    }

  public boolean compare(BoxFruit<?> boxFruit) {
    return Math.abs(getBoxWeight() - boxFruit.getBoxWeight()) < 0.00001;
  }

  public void addFruits(BoxFruit<F> boxFruit) {
    System.out.println("До пересыпания фруктов. Вес в ящике 1: " + fruits.size());
    System.out.println("До пересыпания фруктов. Вес в ящике 2: " + boxFruit.fruits.size());
    fruits.addAll(boxFruit.fruits);
    boxFruit.fruits.clear();
    boxFruit.fruits.trimToSize();
    System.out.println("После пересыпания фруктов. Вес в ящике 1: " + fruits.size());
    System.out.println("После пересыпания фруктов. Вес в ящике 2: " + boxFruit.fruits.size());
  }

}
