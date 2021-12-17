package ru.gb.meshch.hw4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordsArray {
  private String [] arrayWords;

  public WordsArray(String[] arrayWords) {
    this.arrayWords = arrayWords;
  }

  public void doArrayWords() {
    HashMap <String, Integer> mapWords = getMapWords(arrayWords);
    for (Map.Entry entry : mapWords.entrySet()) {
      if (entry.getValue().equals(1)) {
        System.out.println(entry.getKey());
      }
    }
  }

  private HashMap<String, Integer> getMapWords(String[] arrayWords) {
    HashMap <String, Integer> mapWords = new HashMap<>();
    for (int i = 0; i < arrayWords.length; i++) {
      if (mapWords.containsKey(arrayWords[i])) {
        mapWords.put(arrayWords[i], mapWords.get(arrayWords[i]) + 1);
      }
      else {
        mapWords.put(arrayWords[i], 1);
      }
    }
    return mapWords;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("WordsArray{");
    sb.append("arrayWords=").append(arrayWords == null ? "null" : Arrays.asList(arrayWords).toString());
    sb.append('}');
    return sb.toString();
  }
}
