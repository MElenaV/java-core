package ru.gb.meshch.hw1;

public class PassingDistances {
  public static void main(String[] args) {

    Course course1 = new Course(new int[]{1, 2, 3});
    Team team1 = new Team("Шустрики", new String[]{"Иванов", "Петров", "Лисин", "Уткин"});
    course1.doIt(team1);
    team1.showResults();
  }
}
