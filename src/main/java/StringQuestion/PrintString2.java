package StringQuestion;

import java.util.SortedMap;

//1,2,2,1,1,2,3,3,2,1,1,2,3,4,4,3,2,1
public class PrintString2
{
    public static void main(String[]args)
    {
        int num=1;
        int count=2;
        for (int i=0;i<count*2;i++ )
        {
          if (i<count){
            System.out.println(num);
            num++;
          }
          else
          {
              num--;
              System.out.print(num);
          }
          if (i==count*2-1&&count<4)
          {
              count+=1;
              i=-1;

          }

    }
}
}
