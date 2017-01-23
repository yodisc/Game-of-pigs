import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by David Pearson on 2017-01-20.
 * Purpose:
 * ICS3U-1
 */

class userInp {
    static int user(){

        Scanner s = new Scanner(System.in);

        boolean test = false;

        int inp = 0;
        while (!test) {
            try {

                System.out.print("Please enter 1 to roll again or 2 in end turn -> ");
                inp = s.nextInt();

                if ((inp != 1) && (inp != 2)) System.out.println("Please enter either 1 or 2!");
                else test = true;


            } catch (InputMismatchException IME) {

                System.out.println("Please enter either 1 or 2!");
                s.next();

            }
        }

        return inp;

    }

}
