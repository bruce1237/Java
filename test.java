import Scanner;

public class test
{

    public static void main(String[] args)

    {

        test hello = new test();

        int maxScore = hello.getMaxAge();

        System.out.println(maxScore);

    }

    public int getMaxAge()

    {

        int[] ages = { 18, 23, 21, 19, 25, 29, 17 };

        int max = ages[0];

        for (int i = 0; i < ages.length; i++)

        {

            if (ages[i] > max)

            {

                max = ages[i];

            }

        }

        return max;

    }

}
