package ru.gb.meshch.hw4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

  private HashMap<String, HashSet<String>> contact = new HashMap<>();


  public void addContact(String name, String phone) {
    HashSet<String> phones;
    if (contact.containsKey(name)) {
      phones = contact.get(name);
    }
    else {
      phones = new HashSet<>();
    }
    phones.add(phone.replaceAll(" ", ""));
    contact.put(name, phones);

  }


  public static void printContact(PhoneBook phoneBook) {
    System.out.println("Записная книжка:");
    for (Map.Entry<String, HashSet<String>> key : phoneBook.contact.entrySet()) {
      System.out.println("Фамилия: " + key.getKey() + " - Номер телефона: " +key.getValue());
    }
    System.out.println("----Конец записной книжки----");
  }


  public Set<String> getPhoneByName(String name) {
    return contact.get(name);
  }
}
