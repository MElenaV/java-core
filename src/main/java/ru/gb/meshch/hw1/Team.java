package ru.gb.meshch.hw1;

public class Team {
  String nameTeam;
  String arrParticipants[];

  public Team(String nameTeam, String[] arrParticipants) {
    this.nameTeam = nameTeam;
    this.arrParticipants = arrParticipants;
  }

  public String getNameTeam() {
    return nameTeam;
  }

  public void showResults() {
    System.out.println("Участники команды " + getNameTeam() + ":");
    for (int i = 0; i < arrParticipants.length; i++) {
      System.out.println(arrParticipants[i]);
    }
  }
}
