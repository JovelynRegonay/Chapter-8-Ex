import java.util.Scanner;

public class App {
    static float input;

    public static void main(String[] args) throws Exception {

        Savings PiggyBank = new Savings();
        int menu = 0;
        do {
            System.out.println("----------------------------------");
            System.out.println("========PIGGY BANK========");
            System.out.println("1. Show total in bank ");
            System.out.println("2. Add a penny ");
            System.out.println("3. Add nickel ");
            System.out.println("4. Add dime");
            System.out.println("5. Add quarter");
            System.out.println("6.Take money from bank");
            System.out.println("7.Exit");
            System.out.println();

            Scanner s = new Scanner(System.in);
            double ConvertToDollar;
            
            System.out.print("Choose an Option: ");
            

            try {
        
            menu = s.nextInt();
            switch (menu) {
                
                case 1:
                if (PiggyBank.getBalance() >= 100) {
                    ConvertToDollar = PiggyBank.getBalance() / 100;
                    
                        System.out.printf("%.2f dollar(s)", ConvertToDollar);
                    } else {
                        System.out.println(PiggyBank.getBalance() + " cent(s)");
                        System.out.println();
                    }
                    break;
                    
                    case 2:
                    System.out.println("Add a penny");
                    input = s.nextFloat();
                    PiggyBank.save(input);
                    break;
                    
                    case 3:
                    System.out.println("Add a nickel");
                    input = s.nextFloat();
                    input = input * 5;
                    PiggyBank.save(input);
                    break;
                    
                    case 4:
                    System.out.println("Add a dime");
                    input = s.nextFloat();
                    input = input * 10;
                    PiggyBank.save(input);
                    break;
                    
                    case 5:
                    System.out.println("Add a quarter");
                    input = s.nextFloat();
                    input = input * 25;
                    PiggyBank.save(input);
                    break;
                    
                    case 6:
                    System.out.println("Withdraw money");
                    System.out.println("1. Withdraw dollar(s)?");
                    System.out.println("2. Withdraw cent(s)?");
                    int choice = s.nextInt();
                    System.out.println();
                    
                    switch (choice) {
                        case 1:
                        System.out.print("Enter amount: ");
                        input = s.nextFloat();
                        PiggyBank.withdraw(input * 100);
                        break;
                        case 2:
                        System.out.print("Enter amount: ");
                        input = s.nextFloat();
                        PiggyBank.withdraw(input);
                        break;
                    }
                    default :
                    System.out.println("Invalid Input! Please try again...");
                    break;
                    
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Input! Please try again...");
            }
            } while (menu != 7);
            System.out.println();
        }
        
    }