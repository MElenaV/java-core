package ru.gb.meshch.hw1;

import ru.gb.meshch.hw1.obstacleCourse.*;
import ru.gb.meshch.hw1.team.Team;
import ru.gb.meshch.hw1.team.TeamMember;

public class ObstacleCoursePassing {

  public static void main(String[] args) {
    Course c = new Course(new Cross(10), new Fight(4), new Swimming(3), new Jumping(5));
    TeamMember[] teamMember1 = new TeamMember[3];
    teamMember1[0] = new TeamMember("Иванов", 10);
    teamMember1[1] = new TeamMember("Петров", 5);
    teamMember1[2] = new TeamMember("Лисин", 7);

    TeamMember[] teamMember2 = new TeamMember[3];
    teamMember2[0] = new TeamMember("Пупкин", 4);
    teamMember2[1] = new TeamMember("Енотов", 11);
    teamMember2[2] = new TeamMember("Белов", 2);

    Team team1 = new Team("Шустрики",teamMember1);
    Team team2 = new Team("На спорте",teamMember2);

    c.doIt(team1);
    team1.showResults();
    c.doIt(team2);
    team2.showResults();

  }


}
