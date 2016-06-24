import java.util.Scanner;
/**
 * Created by Subramanian Ganesan on 6/24/2016.
 */
public class returnuniq {
    public static void main(String[] ars)
    {
        System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] Arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        int count=0;
        for(int i=0;i<n;i++)
        {
            Arr[i]=s.nextInt();
        }
        for (int j=0;j<Arr.length;j++)
        {
            count=0;
            for (int k=0;k<Arr.length;k++)
            {
                if(Arr[j]==Arr[k])
                    count++;

            }
            if (count==1)
            System.out.println(" The unique element is "+Arr[j]);

        }


