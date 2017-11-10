package dev.uublabs.test1;

/**
 * Created by Admin on 11/10/2017.
 */

public class Armstrong
{
    public static void main(String[] args)
    {
        armStrongNum(153);
    }
    public static void armStrongNum(int num)
    {
        //sum of cube of 3 digits equals num
        String s = num+"";
        if(s.length() ==3)
        {
            int x = Integer.parseInt(s.charAt(0)+"");
            int y = Integer.parseInt(s.charAt(1)+"");
            int z = Integer.parseInt(s.charAt(2)+"");

            if(Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3) == num)
            {
                System.out.println(num +  " is an Armstrong number.");
            }
            else
            {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }
}
