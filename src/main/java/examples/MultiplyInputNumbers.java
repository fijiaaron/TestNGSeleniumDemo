package examples;

public class MultiplyInputNumbers
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 10;
        int c = a + b;

        while(c++ <= 20)
        {
            System.out.println(a + "+" + b + "=" + c);

            if (c > 20)
            {
                System.out.println("c=a+b, which is greater than 20");
            }
            else
            {
                System.out.println("c=a+b, which is less than 20");
            }
        }
    }
}
