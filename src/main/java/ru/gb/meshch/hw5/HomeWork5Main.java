package ru.gb.meshch.hw5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork5Main {

  public static void main(String[] args) {
    read("fileData.csv");

    String[] header = {"Value1-1", "Value2-2", "Value3-3"};
    Integer[][] data = {{1,2,3},{3,2,1}};
    AppData appData2= new AppData(header, data);
    save(appData2);
  }

  public static void read(String file) {
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      List<Integer[]> rowsList = new ArrayList<>();
      String[] header = reader.readLine().split(AppData.getDELIMITER());
      String line;

      while ((line = reader.readLine()) != null) {
        String[] strArr = line.split(AppData.getDELIMITER());
        Integer[] intArr = new Integer[strArr.length];
        for (int i = 0; i < strArr.length; i++){
          intArr[i] = Integer.parseInt(strArr[i]);
        }
        rowsList.add(intArr);
      }
      Integer[][] data = rowsList.toArray(new Integer[][]{});
      System.out.println(Arrays.toString(header));
      System.out.println(Arrays.deepToString(data));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void save(AppData appData) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("new_fileData.txt"))) {
      StringBuffer oneLine = new StringBuffer();

      for (int i = 0; i < appData.getHeader().length; i++) {
        oneLine.append(appData.getHeader()[i]);
        oneLine.append(appData.getDELIMITER());
      }
      writer.write(oneLine.toString());
      writer.newLine();
      for (int i = 0; i < appData.getData().length; i++) {
        Integer[] rowData = appData.getData()[i];
        oneLine.delete(0, oneLine.length());
        for (int j = 0; j < rowData.length; j++) {
          oneLine.append(rowData[j]);
          oneLine.append(appData.getDELIMITER());
        }
        writer.write(oneLine.toString());
        writer.newLine();
      }

      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }



}
