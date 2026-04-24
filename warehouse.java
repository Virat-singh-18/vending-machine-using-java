/*
WAREHOUSE INVENTORY MANAGEMENT

you are a owner of warhouse in which there are total n product with  the following details attributes

1. input - N total number of products
2. for each product take the current stock and the minimum required stock
3. if any product is avaialbe in less than its minimum requirement then print "restock needed for product x " , where x is the product number 
4. total number of product that needs to be restock
*/

import java.util.Scanner;
public class warehouse
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Total number of product :");
        int input = sc.nextInt();
        int current_stock ;
        int minimum_stock ;
        int count = 0;

        for (int i = 1 ; i <= input ; i++)
        {
            System.out.println("Enter the current stock of " + i );
            current_stock = sc.nextInt();
            System.out.println("Enter the minimum required stock of " + i);
            minimum_stock = sc.nextInt();
            if (current_stock < minimum_stock) 
            {
                System.out.println("restock needed for product  "+i);  
                count++; 
            }    
        }
        System.out.println("Total number of item required to restock " + count);
        sc.close();
    }
    
}
