package com.yogesh.cricketplay;
import java.util.Random;
import java.util.Scanner;

public class PlayCricketMain {

    static int totalRun =  0;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
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
        System.out.println("\nTeams Are Playing : " + playingTeamsModel.toString());
    }

    public void makeDecisionToss()
    {
        System.out.print(" Won the toss ");
        int elected = random.nextInt(2);
        final int BAT = 0 ;
        final int BOWL = 1;

        if(elected == BAT ){
            System.out.print("and Elected to Bat First");

            final int inningOver = 5 ;
            int oversNumber = 0;

            for(int i=oversNumber ; i<inningOver; i++)
            {
                System.out.println("Over Number : " + i);
                int overBall = 1 ;

                while(overBall < 7)
                {
                    int run ;

                    run = random.nextInt(7);
                    totalRun = totalRun + run ;

                    System.out.println("\nOver Balls :" + i + "." + overBall + "\tRun :" + run + "\tTotalScore :" + totalRun)  ;

                    overBall++;
                }

            }


        }
        else{
            System.out.print("and Elected to Bowl First");
        }


    }

    public void flippingToss()
    {
        int toss ;

        System.out.println("\nCall 0 OR 1 for toss.\n");
        System.out.println(playingTeamsModel.getTeamSecond() + " Flip the Coin.....");
        System.out.print(playingTeamsModel.getTeamFirst() + " called :");
        int call = scanner.nextInt();


        toss = random.nextInt(2);

        if(toss == call)
        {
            System.out.print(playingTeamsModel.getTeamFirst());
            makeDecisionToss();
        }
        else
        {
            System.out.print(playingTeamsModel.getTeamSecond());
            makeDecisionToss();
        }


    }


    public static void main(String[] args) {

        System.out.println("Welcome To Cricket Game");
        PlayCricketMain playCricket = new PlayCricketMain();
        playCricket.SetTeamsName();
        playCricket.displayTeams();
        playCricket.flippingToss();

    }
}
