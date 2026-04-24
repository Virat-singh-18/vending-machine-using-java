import java.util.Scanner;
public class login 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String pass = "virat" ;
        int count = 0;
        int attempt;
        for(int i = 1 ; i <= 3 ; i++)
        {
            System.out.println(" Enter your password");
            String password = sc.next();
            if(password.equals(pass))
            {
                System.out.println(" your account is unlock");
                break;
            }
            else {
                System.out.println("your "  + i + " attempt wrong");
                count++;
            }
            if(count == 3)
            {
                System.out.println(" your account is locked ");
            }
        }
        

        
    }
    
}
