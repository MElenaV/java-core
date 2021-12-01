package ru.gb.meshch.hw3;


import java.util.Arrays;

public class HomeWork3Main {
  public static double weightApple = 1.0F;
  public static double weightOrange = 1.5F;

  public static void main(String[]args){
    System.out.println("------------Задание 1-------------");
    String[] arrayString = {"Яблоки", "Груши", "Апельсины", "Мандарины", "Киви"};
    Integer[] arrayInteger = {5, 4, 3, 2, 1};
    
    printArray(arrayString);
    changeArrayElements(arrayString, 1, 2);

    printArray(arrayInteger);
    changeArrayElementsWithoutTemp(arrayInteger, 1, 2);
    
    System.out.println("------------Задание 2-------------");
    FruitsInBox();

  }

  private static void changeArrayElementsWithoutTemp(Integer[] arrayInteger, int firstIndex, int secondIndex) {
    int a = arrayInteger[firstIndex]; // 5
    int b = arrayInteger[secondIndex]; // 3

    a = a + b;  // 8
    b = b - a;  // -5
    b = -b;  // 5
    a = a - b;  // 3

    arrayInteger[firstIndex] = a;
    arrayInteger[secondIndex] = b;

    printArray(arrayInteger);

  }

  private static void changeArrayElements(Object[] array, int firstIndex, int secondIndex) {
    Object temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
    printArray(array);
  }

  private static void printArray(Object[] array) {
    System.out.println(Arrays.toString(array));
  }


  private static void FruitsInBox() {
    BoxFruit<Apple> appleBox1 = new BoxFruit<>(weightApple);
    BoxFruit<Orange> orangeBox1 = new BoxFruit<>(weightOrange);
    BoxFruit<Apple> appleBox2 = new BoxFruit<>(weightApple);

    for (int i = 0; i < 3; i++) {
      appleBox1.addFruit(new Apple());
      orangeBox1.addFruit(new Orange());
      appleBox2.addFruit(new Apple());
    }
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());

    orangeBox1.addFruit(new Orange());

    appleBox2.addFruit(new Apple());

    System.out.println("Вес первой коробки с яблоками: " + appleBox1.getBoxWeight());
    System.out.println("Вес коробки с апельсинами: " + orangeBox1.getBoxWeight());
    System.out.println("Вес второй коробки с яблоками: " + appleBox2.getBoxWeight());
    System.out.println("Сравниваем. Одинаковый ли вес коробки с апельсинами и первой коробки с яблоками? " + appleBox1.compare(orangeBox1));
    System.out.println("-----------------------------------------");

    appleBox1.addFruits(appleBox2);
  }
}
