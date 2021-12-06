package ru.gb.meshch.hw4;

import java.util.*;

import static ru.gb.meshch.hw4.PhoneBook.printContact;

public class HomeWorkCollection {

  public static void main(String[] args) {

    String[] words = {"Яблоки", "Груши", "Варенье", "Мёд", "Груши", "Персики", "Апельсины", "Бананы", "Виноград", "Груши", "Апельсины", "Морковь", "Томаты", "Сок"};
    String[] wordsForWay2 = {"Яблоки", "Груши", "Варенье", "Мёд", "Груши", "Персики", "Апельсины", "Бананы", "Виноград", "Груши", "Апельсины", "Морковь", "Томаты", "Сок"};

    System.out.println(Arrays.toString(words) + "\nКоличество элементов в массиве = "+ words.length);

    Set mySetWords = new HashSet(Arrays.asList(words));
    System.out.println(mySetWords + "\nКоличество элементов в коллекции = " + mySetWords.size());

    System.out.println("\nСпособ 2 из лекции. Из массива извлечены повторяющиеся элементы:");
    WordsArray wordsArray = new WordsArray(wordsForWay2);
    wordsArray.doArrayWords();
    System.out.println("---------------------------------");


    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addContact("Иванов", "89106549878");
    phoneBook.addContact("Петров", "79201645898");
    phoneBook.addContact("Лисин", "+7(950)654-87-98");
    phoneBook.addContact("Иванов", "+7(916)164-78-11");
    phoneBook.addContact("Сизов", "89107894521");

    printContact(phoneBook);

    System.out.println("Иванов: " + phoneBook.getPhoneByName("Иванов"));
    System.out.println("Сизов: " + phoneBook.getPhoneByName("Сизов"));
    System.out.println("Кролин: " + phoneBook.getPhoneByName("Кролин"));
  }
}
