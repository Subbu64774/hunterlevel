import java.util.Scanner;
import java.lang.*;
/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class coinremoval {
    public static void main(String[] args)
    {
        char c1,c2,c3;int pos;
        StringBuilder s = new StringBuilder("_THHTHHH_");
        while(!s.equals("________")) {
            System.out.println(s);


            System.out.println("Enter the position to delete");
            Scanner sc = new Scanner(System.in);
            pos = sc.nextInt();
            if(s.charAt(pos-1)=='T')
            {
                System.out.println("You are entered the tail position" +
                        "Please enter the head position to remove");

            }
            else {
                c1 = s.charAt(pos - 2);
                c2 = s.charAt(pos);

                switch (c1) {
                    case 'H':
                        s.setCharAt(pos - 2, 'T');
                        break;
                    case 'T':
                        s.setCharAt(pos - 2, 'H');
                        break;
                }
                switch (c2) {
                    case 'H':
                        s.setCharAt(pos , 'T');
                        break;
                    case 'T':
                        s.setCharAt(pos , 'H');
                        break;
                }
                s.setCharAt(pos-1, '_');
            }

        }
}
}
