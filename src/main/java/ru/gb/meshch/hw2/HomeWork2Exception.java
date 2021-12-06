package ru.gb.meshch.hw2;

import java.util.Scanner;

public class HomeWork2Exception {
  private static int xArr = 4;
  private static int yArr = 4;
  private static boolean creatingArr = false;

  public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
    Scanner scanner = new Scanner(System.in);

    String [][] myArray = new String[0][];


    while (creatingArr == false) {
      System.out.printf("Введите размер двумерного массива %d*%d в формате: X Y\n", xArr, yArr);
      String s = scanner.nextLine();
      int x = s.charAt(0) - '0';
      int y = s.charAt(2) - '0';
      myArray = setTheArray(x,y);
    }
    System.out.println("Создан двумерный массив");
    System.out.println("Заполните созданный массив числовыми значениями");
    fillArray(myArray);
    SumArray(myArray);

  }

  public static String[][] setTheArray(int x, int y) throws MyArraySizeException {
      if ((x == xArr) && (y == yArr)) {
        String [][] myArray = new String[x][y];
        creatingArr = true;
        return myArray;
      } else {
        throw new MyArraySizeException("/ Размер массива некорректный! Должен быть 4*4");
      }
  }

  private static void fillArray(String[][] myArray) {
    String valueArr;
    Scanner scanner2 = new Scanner(System.in);
    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++) {
        valueArr = scanner2.nextLine();
        myArray[i][j] = valueArr;
      }
    }
    for (int i = 0; i <= myArray[0].length; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(i + 1 + " ");
      for (int j = 0; j < myArray[i].length; j++) {
        System.out.print(myArray[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void SumArray(String[][] myArray) throws MyArrayDataException {
    int sum = 0;
    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++) {
        try {
          sum = sum + Integer.valueOf(myArray[i][j]);
        } catch (NumberFormatException e) {
          e.printStackTrace();
          throw new MyArrayDataException(i + 1, j + 1);
        }

      }
    }
    System.out.println("Сумма элементов массива = " + sum);
  }


}
