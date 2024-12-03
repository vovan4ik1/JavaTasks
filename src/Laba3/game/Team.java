package Laba3.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<Object> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(Team<T> otherTeam) {
      this.name = otherTeam.name;
    }
    public void addNewParticipant(Object participant) {
        participants.add(participant);
        if(participant instanceof Participant) {
            System.out.println("To the team " + name + " was added participant " + ((Participant) participant).getName());
        } else {
            System.out.println("To the team " + name + " was added participant " + participant);
        }
    }

    @Override
    public String toString() {
        return "Team{" + "teamName='" + name + "'}";
    }

    public Team<T> cloneTeam() {
      return new Team<>(this);
    }

    public void playWith(Team team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("The team " + winnerName + " is winner!");
    }

    public String getName() {
        return name;
    }

    public List<Object> getParticipants() {
        return participants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipants(List<Object> participants) {
        this.participants = participants;
    }
}
