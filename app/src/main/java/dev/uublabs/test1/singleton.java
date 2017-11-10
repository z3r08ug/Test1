package dev.uublabs.test1;

/**
 * Created by Admin on 11/10/2017.
 */

public class singleton
{

    public static void main(String[] args)
    {
        int [] a = { 2,3,4,5,5,6,7,15};
        fizzBuzz(a);
        findMostUsed(a);
    }

    public static void findMostUsed(int []nums)
    {
        int most = nums[0];
        int maxOccur = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            int count = 1;
            for (int x = 0; x < nums.length; x++)
            {
                if (nums[x] == n)
                    count++;
                if (count > maxOccur)
                {
                    most = n;
                    maxOccur = count;
                }
            }
        }
        System.out.println("The number that occured the most was: "+most);
    }
    public static void fizzBuzz(int []nums)
    {
        for(int x = 0;x<nums.length; x++)
        {
            if(nums[x]%3==0 && nums[x]%5==0)
            {
                System.out.println("fizz buzz");
            }
            else if(nums[x] % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if(nums[x] %5 == 0)
            {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(nums[x]);
            }
        }
    }
}
