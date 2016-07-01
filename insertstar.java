/**
 * Created by Subramanian Ganesan on 7/1/2016.
 */
public class insertstar {
    public static void main(String[] args)
    {
        String word="hello";
        char[] word1=new char[word.length()+1];
        char[] characters = word.toCharArray();
        for (int i=0;i<characters.length-1;i++)
        {
            if (characters[i]==characters[i+1])
            {
                System.out.println(characters[i] +" "+ characters[i+1]);
                word1[i]=word.charAt(i);
                word1[i+1]='*';
               i=i+1;
            }
            else
                word1[i]=characters[i];
        }
        String s=new String(word1);
        System.out.println(s);

    }
}
