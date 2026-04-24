
/* you need to calculate the total electricity bill based on the number of units consuption ond 

for 0 to 100 1.5per unit 
for 101 to 200 3.5 per unit 
rest unit 5 per unit
claculate the total bill and add a rs 50 as fixed charge
add extra fine of 10% of the total bill if bill exceeds rs 2000 

 */
import java.util.*;
public class question 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of consuption of total units  : ");
        double unit = sc.nextDouble();
        double bill = 0;

        if(unit >= 0 && unit <= 100) 
        {
           bill = unit * 1.5;
        }
        else if (unit >= 101 && unit <= 200 )
        {
            bill = 100 * 1.5 + (unit - 100)*3.5;
        }
        else 
        {
            bill =500 + (unit -200 )*5; 
        }

        bill = bill+50;


        if(bill > 2000)
        {
            bill = bill + bill*0.1;
        }

        System.out.println(" your total bill is :" + bill);
    }

    
}
