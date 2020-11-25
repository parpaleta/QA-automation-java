package work.lecture10hw;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class Team {
    private String name;
    private List<Player> listOfPlayers;

    public Team(String name) {
        this.name = name;
        this.listOfPlayers = new ArrayList<>();
    }

    public void addPlayer(String teamName, Player player){
        if(teamName == null || teamName.trim().isEmpty()) {
            log.info("Empty string for team");
        }
        this.listOfPlayers.add(player);
    }

    public void removePlayer(String teamName, Player player){
        this.listOfPlayers.remove(player);
    }

    public boolean checkRangeOfSkills(Player player){
        Boolean check = true;
        if(player.getEndurance() < 0 || player.getEndurance() > 100){
            check = false;
        }
        if(player.getShooting() < 0 || player.getShooting() > 100){
            check = false;
        }
        if(player.getPassing() < 0 || player.getPassing() > 100){
            check = false;
        }
        if(player.getDribble() < 0 || player.getDribble() > 100){
            check = false;
        }
        if(player.getSprint() < 0 || player.getSprint() > 100){
            check = false;
        }
        return check;
    }

    public int calcTeamsRating(String teamName){
        int sum = 0;

        for (int i = 0; i <= listOfPlayers.size() - 1;  i++){
            double skill = this.listOfPlayers.get(i).calcPlayersOverallSkill(this.listOfPlayers.get(i));
            sum += skill;
        }
        return (int) sum / this.listOfPlayers.size();
    }
}
