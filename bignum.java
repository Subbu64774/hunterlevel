/**
 * Created by Subramanian Ganesan on 6/21/2016.
 */
public class bignum {
    public static void main(String[] argw)
    {
        int[] a={3,44585,120,9,340};
        int count=0,rem=0,rem1=0;
        for (int i=0;i<a.length;i++)
        {
            int temp=a[i];count=0;rem=0;
            int[] temparray1=new int[5],temparray = new int[5];
            int count1=0;
            while(temp>0)
            {
                int a1=0;
                rem=temp%10;
                count++;
                temp=temp/10;
                temparray[a1]=rem;
                a1++;

            }

            for(int j=0;j<a.length;j++)
            {

                int temp1=a[j];
                //if (a[i]!=a[j])
                //{
                    while (temp1 > 0)
                    {
                        int a2=0;
                        rem1 = temp % 10;
                        count1++;
                        temp1 = temp1 / 10;
                        temparray1[a2]=rem1;
                        a2++;
                    }
                    if (count < count1)
                    {
                        int swap = a[i];
                        a[i] = a[j];
                        a[j] = swap;
                    }

               // }

            }
            for (int l=0;l<count;l++)
            {
              if (temparray[0]  < temparray1[0])
              {
                  int temp3=temparray[0];
                  temparray[0]=temparray1[0];
                  temparray1[0]=temparray[0];
              }
                System.out.println(temparray[l]);
            }
        }
        //System.out.println(rem+"   "+rem1);
        for (int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
