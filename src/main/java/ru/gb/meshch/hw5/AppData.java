package ru.gb.meshch.hw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
