package com.yogesh.cricketplay;

public class PlayingTeamsModel {

    private String teamFirst ;
    private String teamSecond;

    public void setTeamFirst(String teamFirst)
    {
        this.teamFirst = teamFirst ;
    }

    public void setTeamSecond(String teamSecond)
    {
        this.teamSecond = teamSecond ;
    }

    public String getTeamFirst()
    {
        return teamFirst ;
    }

    public String getTeamSecond()
    {
        return teamSecond ;
    }



    @Override
    public String toString() {
        return "PlayingTeamsModel{" +
                "teamFirst='" + teamFirst + '\'' +
                ", teamSecond='" + teamSecond + '\'' +
                '}';

}
}
