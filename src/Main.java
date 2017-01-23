/**
 * Created by David Pearson on 2017-01-20.
 * Purpose:
 * ICS3U-1
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("         ***********************************");
        System.out.println("Welcome to pig: the dice game!");
        System.out.println("Some basic rules: ");
        System.out.println("Each turn, a player repeatedly rolls a die until either a 1 is rolled or the player decides to hold");
        System.out.println("If the player rolls a 1, they score nothing and it becomes the next player's turn.");
        System.out.println("If the player rolls any other number, it is added to their turn total and the player's turn continues.");
        System.out.println("If a player chooses to hold, their turn total is added to their score, and it becomes the next player's turn.");
        System.out.println("The first player to score 100 or more points wins.");
        System.out.println("Finally: If the player rolls snake eyes, the score is reset!");
        System.out.println("Have fun! You will be playing our very own, one of a kind intelligent AI system!");
        System.out.println("         ***********************************");
        System.out.println();

        int scoreP = 0;
        int scoreAI = 0;
        int roundSP = 0;


        while (scoreAI <= 100 && scoreP <= 100){

            System.out.println("You have a score of: " + scoreP );

            System.out.println("Robot has a score of: " + scoreAI);
            System.out.println();


            int user = userInp.user();
            if (user == 1){

                int dieT = Dice.DieT();

                switch (dieT) {
                    case -1:
                        System.out.println("You rolled snake eyes! Your score is now 0 :( ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        roundSP = 0;

                        scoreP = 0;
                        scoreAI += AI.comp();

                        if (scoreAI == -1) {
                            scoreAI = 0;
                        }


                        break;
                    case 0:
                        System.out.println("You rolled a 1! You score 0 points this round and its the AI's turn!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        roundSP = 0;

                        scoreAI += AI.comp();
                        if (scoreAI == -1) {
                            scoreAI = 0;
                        }


                        break;
                    default:

                        roundSP += dieT;
                        System.out.println("You have a round score of: " + roundSP);
                        System.out.println();

                        break;
                }

            } else {

                scoreP += roundSP;
                roundSP = 0;
                if (scoreP >= 100){

                    System.out.println("Congrats! You have beaten the robot with a score of: " + scoreP);

                }

                scoreAI += AI.comp();

                if (scoreAI == -1){
                    scoreAI = 0;
                }

            }

            if (scoreAI >= 100){

                System.out.println("Robot has won with a score of: " + scoreAI);

            }

        }

    }

}
