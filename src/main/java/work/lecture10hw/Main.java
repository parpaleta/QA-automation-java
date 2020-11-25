package work.lecture10hw;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Player> players = new LinkedHashMap<>();
        Map<String, Team> team = new LinkedHashMap<>();

        String[] teamRow = reader.readLine().split(";");

        Team teamNew = new Team(teamRow[1]);
        team.putIfAbsent(teamNew.getName(),teamNew);

        String line;
        while (true){
            if("end".equalsIgnoreCase(line = reader.readLine())){
                break;
            }

            String[] playerRow = line.split(";");
            String toDo = playerRow[0];
            String teamName = playerRow[1];

            Team team1 = team.get(teamName);
            if(team.containsKey(teamName) && toDo.equalsIgnoreCase("add")){
                Player playerNew = new Player(playerRow[2],Integer.parseInt(playerRow[3]),Integer.parseInt(playerRow[4]),Integer.parseInt(playerRow[5]),Integer.parseInt(playerRow[6]),Integer.parseInt(playerRow[7]));
                if(team1.checkRangeOfSkills(playerNew)){
                    players.putIfAbsent(playerNew.getName(),playerNew);
                    team1.addPlayer(teamName,playerNew);
                }
            }
            if(!team.containsKey(teamName)){
                log.info("Team {} does not exist.", teamName);
            }

            if(team.containsKey(teamName) && toDo.equalsIgnoreCase("remove")){
                String playerName = playerRow[2];
                if(players.containsKey(playerName)){
                    team1.removePlayer(teamName,players.get(playerName));
                }else{
                    log.info("Player {} is not in {} team.", playerName, teamName);
                }
            }

            if(team.containsKey(teamName) && toDo.equalsIgnoreCase("rating")){
                int score = team1.calcTeamsRating(teamName);
                log.info("{} - {}", teamName, Integer.toString(score));
            }
        }
    }
}
