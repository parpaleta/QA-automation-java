package work.lecture10hw;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;


    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public double calcPlayersOverallSkill(Player player){
       int overallSkill = 0;
        overallSkill = (this.getEndurance() + this.getPassing() + this.getDribble() + this.getPassing() + this.getShooting()) / 5;
        return overallSkill;
    }

    private void setName(String name){
        if(name == null || name.trim().isEmpty() || name == " "){
            throw new IllegalArgumentException("A name should not be empty. ");
        }
        this.name = name;
    }
    private void setEndurance(int endurance){
        if(endurance < 0 || endurance > 100){
            log.info("Endurance {} should be between 0 and 100.", endurance);
        }
        this.endurance = endurance;
    }
    private void setSprint(int sprint){
        if(sprint < 0 || sprint > 100){
            log.info("Sprint {} should be between 0 and 100.", sprint);
        }
        this.sprint = sprint;
    }
    private void setDribble(int dribble){
        if(dribble < 0 || dribble > 100){
            log.info("Dribble {} should be between 0 and 100.", dribble);
        }
        this.dribble = dribble;
    }
    private void setPassing(int passing){
        if(passing < 0 || passing > 100){
            log.info("Passing {} should be between 0 and 100.", passing);
        }
        this.passing = passing;
    }
    private void setShooting(int shooting){
        if(shooting < 0 || shooting > 100){
            log.info("Shooting {} should be between 0 and 100.", shooting);
        }
        this.shooting = shooting;
    }
}
