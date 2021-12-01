package ru.gb.meshch.hw3;

public abstract class Fruit {
  private double weight;
  private int count;

  public Fruit(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
