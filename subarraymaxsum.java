import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class subarraymaxsum {
    public static void main(String[] ars)
    {
        System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] Arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        int count=0;int b1[]=new int[3],b2[] =new int[3];int sum=0,sum1=0,tempsum=0;
        for(int i=0;i<n;i++)
        {
            Arr[i]=s.nextInt();
        }
        for (int i=0;i<Arr.length;i++)
        {
             b1= Arrays.copyOfRange(Arr, i, i + 3);
             b2=Arrays.copyOfRange(Arr, i+1, i + 4);
        for (int k=0;k<b1.length;k++)
        {
            sum=sum+b1[k];
            sum1=sum1+b2[k];

        }
            for (int k=0;k<b1.length;k++)
            if (sum>sum1){
            tempsum=sum;}
            else if (tempsum <sum1)
            {
            tempsum=sum1;

             }
            else
                System.out.print(b1[k]);

            System.out.println();
    }}
}
//            b2=Arrays.copyOfRange(Arr, i+1, i + 4);
//            for (int j=0;j<b1.length;j++)
//            {
//                sum=sum+b1[j];
//                sum1=sum1+b2[j];
//            }
//            if(sum>sum1)
//                System.out.println(b1);
//            else
//                System.out.println(Arrays.toString(b2));
//
//        }
//}
//}
