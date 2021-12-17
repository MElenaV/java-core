package ru.gb.meshch.hw5;

public class AppData {

  private static final String DELIMITER = ";";
  private static String[] header;
  private static Integer[][] data;

  public AppData(String[] header, Integer[][] data) {
    this.header = header;
    this.data = data;
  }

  public static String getDELIMITER() {
    return DELIMITER;
  }

  public static String[] getHeader() {
    return header;
  }

  public static Integer[][] getData() {
    return data;
  }

}
