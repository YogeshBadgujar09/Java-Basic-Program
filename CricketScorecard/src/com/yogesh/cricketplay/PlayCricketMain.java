package com.yogesh.cricketplay;
import java.util.Scanner;

public class PlayCricketMain {
    Scanner scanner = new Scanner(System.in);
    PlayingTeamsModel playingTeamsModel = new PlayingTeamsModel();

    public void SetTeamsName()
    {
        System.out.println("Enter First Team Name  :");
        playingTeamsModel.setTeamFirst(scanner.next());

        System.out.println("Enter Second Team Name :");
        playingTeamsModel.setTeamSecond(scanner.next());
    }

    public void displayTeams()
    {
        System.out.println("Teams Are Playing : " + playingTeamsModel.toString());
    }


    public static void main(String[] args) {

        System.out.println("Welcome To Cricket Game");
        PlayCricketMain playCricket = new PlayCricketMain();
        playCricket.SetTeamsName();
        playCricket.displayTeams();

    }
}
