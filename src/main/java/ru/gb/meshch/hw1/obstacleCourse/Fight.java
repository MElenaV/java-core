package ru.gb.meshch.hw1.obstacleCourse;


import ru.gb.meshch.hw1.team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}
