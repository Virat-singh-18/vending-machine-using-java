import java.util.*;
public class discount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the total amount of your bill :");
        double bill = sc.nextDouble();
        System.out.println(" custmer is premium or not ");
        boolean premium = sc.nextBoolean();
        double discount = 0;
        
        if(bill >= 5000 && premium == true)
        {
            discount = (bill*25)/100;
            bill = bill - discount;
             System.out.println("your bill is " + bill); 
        }
        else if (bill >= 3000 )
        {
            discount = (bill*10)/100;
            bill = bill - discount;
             System.out.println("your bill is " + bill);
        }
        else if (bill >= 5000 )
        {
            discount = (bill*20)/100;
            bill = bill - discount;
             System.out.println("your bill is " + bill);
        }    
    }
    
}
