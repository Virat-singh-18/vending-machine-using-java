import java.util.Scanner;
public class Traffic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in);
        System.out.println(" Enter the speed of vehical : ");
        int speed = sc.nextInt();
        int fine = 0;
        System.out.println("vehical repeated or not");
        boolean violation = sc.nextBoolean();
        if(speed >= 80 && speed <= 100)
        {
            fine += 500;
        }
        else if (speed > 100 )
        {
            fine = fine + 1000;
        }
        if(violation == true)
        {
            fine = fine*2;
        }
        System.out.println(" your total fine is :" + fine );
    }
}
