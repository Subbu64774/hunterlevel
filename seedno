import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class seedno {
    public static void main(String[] a)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int seedno=num;
        int sum=0;
        while(temp>0){
            seedno=seedno*(temp%10);
            sum=sum+(temp%10);
            temp=temp/10;

        }
        num=num*sum;
        if (num==seedno)
        {
            System.out.println(num/sum+"  the number is a seed number ");
        }
        else
            System.out.println(num/sum +" is not a seed number");
    }
}
