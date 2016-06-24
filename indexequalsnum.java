/**
 * Created by Subramanian Ganesan on 6/24/2016.
 */
public class indexequalsnum {
    public static void main(String[] args)
    {
        int[] a=new int[]{1,2,3,4,5};
        for (int i=0;i<a.length;i++)
        {
            if(i==a[i])
            {
                System.out.println(i+ " value is equal to the index of this value");
            }
        }
    }
}
