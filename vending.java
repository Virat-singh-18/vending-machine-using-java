import java.util.Scanner;

class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotalBill = 0;
        int TrayNumber;

        do {
            System.out.println("Tray 1. Beverages");
            System.out.println("Tray 2. Snack");
            System.out.println("Tray 3. Chocolate");
            System.out.println("Select your Tray (1/2/3/0 to exit)");

            TrayNumber = sc.nextInt();

            switch (TrayNumber) {

                case 1:
                    char stay;
                    do {
                        System.out.println("a. Coca Cola 40");
                        System.out.println("b. Sprite 40");
                        System.out.println("c. Monster 150");
                        System.out.println("d. Redbull 100");

                        System.out.println("Select item (a/b/c/d)");
                        char choice = sc.next().charAt(0);

                        if (choice == 'a') TotalBill += 40;
                        else if (choice == 'b') TotalBill += 40;
                        else if (choice == 'c') TotalBill += 150;
                        else if (choice == 'd') TotalBill += 100;

                        System.out.println("Stay on same tray? (y/n)");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');
                    break;

                case 2:
                    do {
                        System.out.println("a. Lays 40");
                        System.out.println("b. Balaji 40");
                        System.out.println("c. Bikaji 150");
                        System.out.println("d. Kurkure 100");

                        System.out.println("Select item (a/b/c/d)");
                        char choice = sc.next().charAt(0);

                        if (choice == 'a') TotalBill += 40;
                        else if (choice == 'b') TotalBill += 40;
                        else if (choice == 'c') TotalBill += 150;
                        else if (choice == 'd') TotalBill += 100;

                        System.out.println("Stay on same tray? (y/n)");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');
                    break;

                case 3:
                    do {
                        System.out.println("a. Dairy Milk 40");
                        System.out.println("b. KitKat 40");
                        System.out.println("c. Five Star 50");
                        System.out.println("d. Perk 20");

                        System.out.println("Select item (a/b/c/d)");
                        char choice = sc.next().charAt(0);

                        if (choice == 'a') TotalBill += 40;
                        else if (choice == 'b') TotalBill += 40;
                        else if (choice == 'c') TotalBill += 50;
                        else if (choice == 'd') TotalBill += 20;

                        System.out.println("Stay on same tray? (y/n)");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (TrayNumber != 0);

        System.out.println("Your Total bill is: " + TotalBill);
        sc.close();
    }
}