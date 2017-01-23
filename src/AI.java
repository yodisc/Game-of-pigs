/**
 * Created by David Pearson on 2017-01-22.
 * Purpose:
 * ICS3U-1
 */

class AI {
    static int comp(){

        int k = 0;

        while (true){

            int diceT = Dice.DieT();

            if (diceT == -1){
                System.out.println("Robot has rolled snake eyes!");
                System.out.println();

                return -1;

            } else if (diceT == 0){
                System.out.println("Robot has rolled a 1!");
                System.out.println();

                return 0;

            } else {
                k += diceT;

                int chance = (5*k + 20)/6;

                if (chance > k){
                    //keep rolling
                    System.out.println("Robot will roll again!");
                    System.out.println();

                } else if (chance == k ){
                    //Stop rolling
                    System.out.println("Robot has ended turn");
                    System.out.println();
                    return k;

                } else {
                    //Stop rolling
                    System.out.println("Robot has ended turn");
                    System.out.println();
                    return k;


                }

            }

        }

    }

}
