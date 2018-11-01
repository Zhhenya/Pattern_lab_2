package Teams;

import Characters.Beater;
import Characters.Catcher;
import Characters.Goalkeeper;
import Characters.Hunter;

public class Team {
    public String teamName;
    public Hunter firstHunter;
    public Hunter secondHunter;
    public Hunter thirdHunter;
    public Goalkeeper goalkeeper;
    public Catcher catcher;
    public Beater firstBeater;
    public Beater secondBeater;
    public int countOfPoints = 0;

    public Team(){}

   /* public void countPoints(int points){
        countOfPoints += points;
    }

    public int getCountOfPoints() {
        return countOfPoints;
    }
*/
    public Team(String teamName){
        this.teamName = teamName;
    }


  /*  public String getTeamName() {
        return teamName;
    }*/

  /*  public Hunter getFirstHunter() {
        return firstHunter;
    }

    public Hunter getSecondHunter() {
        return secondHunter;
    }

    public Hunter getThirdHunter() {
        return thirdHunter;
    }

    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }

    public Catcher getCatcher() {
        return catcher;
    }

    public Beater getFirstBeater() {
        return firstBeater;
    }

    public Beater getSecondBeater() {
        return secondBeater;
    }

    public void setFirstHunter(Hunter firstHunter) {
        this.firstHunter = firstHunter;
    }

    public void setSecondHunter(Hunter secondHunter) {
        this.secondHunter = secondHunter;
    }

    public void setThirdHunter(Hunter thirdHunter) {
        this.thirdHunter = thirdHunter;
    }

    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public void setCatcher(Catcher catcher) {
        this.catcher = catcher;
    }

    public void setFirstBeater(Beater firstBeater) {
        this.firstBeater = firstBeater;
    }

    public void setSecondBeater(Beater secondBeater) {
        this.secondBeater = secondBeater;
    }
*/
  /*  public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
*/

}
