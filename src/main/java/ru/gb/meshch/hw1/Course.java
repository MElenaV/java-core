package ru.gb.meshch.hw1;

public class Course {
  int [] arrCourse;

  public Course(int[] arrCourse) {
    this.arrCourse = arrCourse;
  }

  public void doIt(Team team) {
      for (int i = 0; i < arrCourse.length; i++) {
        for (int j = 0; j < team.arrParticipants.length; j++) {
          System.out.println("Участник " + team.arrParticipants[j] + " прошел припятствие " + arrCourse[i]);
      }
    }
    System.out.println("Ура! Пройдена дистанция командой " + team.getNameTeam());
  }
}
