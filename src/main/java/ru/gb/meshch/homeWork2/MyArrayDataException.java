package ru.gb.meshch.HomeWork2;


public class MyArrayDataException extends Exception {

  public MyArrayDataException(String message) {
    super(message);
  }

  public MyArrayDataException(int row, int col) {
    super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", row, col));
  }

}
