import java.util.Random;

/**
 * Created by David Pearson on 2017-01-20.
 * Purpose:
 * ICS3U-1
 */

class Dice {

    static int DieT() {

        Random r = new Random();

        int roll1 = r.nextInt((6 - 1) + 1) + 1;
        System.out.println("Rolling first die!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The first die rolled a -> " + roll1);
        System.out.println();

        int roll2 = r.nextInt((6 - 1) + 1) + 1;
        System.out.println("Rolling second die!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }
        System.out.println("The second die rolled a -> " + roll2);

        int rollT = roll1 + roll2;

        System.out.println();
        System.out.println("A total value of -> " + rollT);
        System.out.println();

        if (roll2 == 1 && roll1 == 1) {

            return -1;

        } else if (roll1 == 1 || roll2 == 1) {

            return 0;

        } else {

            return rollT;

        }

    }

}
