package ru.gb.meshch.hw1.obstacleCourse;


import ru.gb.meshch.hw1.team.TeamMember;

public class Jumping extends Obstacle {

    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
