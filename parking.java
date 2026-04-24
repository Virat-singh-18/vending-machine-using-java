
/*  you owns a parking lot in which there are varible prices for differnt number of hours you need to hire a developer who can write the program to calculate the total bill

for the first two hours 100 rupees per hours
for the next three hours 50 rupees per hours 
rest hours 25 rupees per hours

*/
import java.util.Scanner;
public class parking 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Total number of Hours : ");
        double hours = sc.nextDouble();
        double bill = 0;

        if(hours <= 2){
        bill = hours*100;
        }
    else if(hours <= 5)
    {
        bill = 2*100 + (hours - 2)*50;
    }
    else {
        bill = 2*100 + 3*50 + (hours - 5)*25;
    }

    System.out.println(" tour final bill is " + bill);
    sc.close();

    }
    
}
