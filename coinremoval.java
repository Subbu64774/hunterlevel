import java.util.Scanner;
import java.lang.*;
/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class coinremoval {
    public static void main(String[] args)
    {
        char c1,c2,c3;int pos;
        StringBuilder s = new StringBuilder("THHTHHHT");
        while(!"________".equals(s)) {
            System.out.println(s);


            System.out.println("Enter the position to delete");
            Scanner sc = new Scanner(System.in);
            pos = sc.nextInt();
            pos = pos - 1;
            //System.out.println(pos);
            //System.out.println(s.charAt(pos));
            if (pos <= s.length())
            {

                if (s.charAt(pos) == 'T' || s.charAt(pos) == '_') {
                    System.out.println("You are entered the tail position or already deleted position " +
                            " Please enter the head position or unremoved position to remove");

                } else {

                    if (pos <= 0) {
                        // System.out.println("check : "+pos);
                        c1 = s.charAt(pos);
                        c2 = s.charAt(pos + 1);
                    } else if (pos >= s.length() - 1) {
                        c1 = s.charAt(pos - 1);
                        c2 = s.charAt(pos);
                    } else {
                        c1 = s.charAt(pos - 1);
                        c2 = s.charAt(pos + 1);
                    }


                    switch (c1) {
                        case 'H':
                            s.setCharAt(getpos((pos - 1), s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpos((pos - 1), s), 'H');
                            break;
                    }
                    switch (c2) {
                        case 'H':
                            s.setCharAt(getpos(pos + 1, s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpos(pos + 1, s), 'H');
                            break;
                    }
                    s.setCharAt(pos, '_');
                }

            }
            else
            {
                System.out.println("Please enter only available position to delete");
            }
        }
}

    private static int getpos(int i,StringBuilder s) {
            if(i<=0)
                return 0;
        else if (i>=s.length())
                return i-1;
        else
                return i;

    }
}
