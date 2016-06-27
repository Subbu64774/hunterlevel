import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class leastno {
    public static void main(String[] as)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int length=0,temp=no;
        while(temp>0){
            temp=temp/10;
            length++;
        }
        int[] a=new int[length+1];
        int i=0,temp1;
        while(no>0){
            temp1=no%10;
            a[i]=temp1;
            no=no/10;
            i++;
        }
        int temp2=0;
        for (int k=0;k<a.length;k++)
        {
            for (int j=0;j<a.length;j++)
            {
                if (a[i]>a[i+1])
                {
                    temp2=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp2;
                }

            }
        }
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k]);
        }
        System.out.println("enter digits to delete");
        int digits=sc.nextInt();
        for (int k=0;k<a.length-digits;k++)
            System.out.print(a[k]);
    }
}
