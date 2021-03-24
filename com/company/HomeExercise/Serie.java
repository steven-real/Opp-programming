package com.company.HomeExercise;

public class Serie {

    public static void main(String[] args)
    {
        Serie s=new Serie();
        s.fibonacci(50);

    }
    public void fibonacci(long n )
    {   long n1=0;
        long n2=1;
        long n3=0;

       for (long  i=0;i<(n-2);++i)
        {
            if(i==0)
            {
                System.out.println("0");
                System.out.println("1");
            }
           n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

}





