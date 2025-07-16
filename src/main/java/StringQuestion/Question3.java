package StringQuestion;
//1,2,1,2,3,1,2,3,4,1,2,3,4,5

public class Question3
{
    public static void main(String[] args)
    {
        int count=3;
       int num=1;
        for (int k = 1; k <= 14; k++)
        {
            if(num<count) {
                System.out.println(num);
                num++;
            }
            if(num==count){
                num=1;
                count=count+1;
            }


        }

         }

    }





