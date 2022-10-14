
import jdk.jshell.Snippet;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpt();
        int atmNumber = 123;
        int atmPin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our ATM machine");
        System.out.print("Enter your atm number : ");
        int atmnumber = in.nextInt();
        System.out.print("Enter your ATM pin : ");
        int atmpin = in.nextInt();

        if((atmNumber == atmnumber) && (atmPin == atmpin)){
            while(true){
                System.out.println("1. Check available balance \n2. Make Withdrawal \n3. Make Deposite \n4. View mini statement \n5. Exit.");
                int choice = in.nextInt();
                if(choice == 1){
                    op.viewBalance();
                } else if (choice ==2) {
                    System.out.print("Enter amount to withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (choice == 3) {
                    System.out.print("Enter amount to be deposited : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (choice == 4) {
                    op.viewMiniStatement();
                } else if (choice == 5) {
                    System.out.println(" Thanks for using our ATM machine\n Collect your card.");
                    System.exit(0);
                }else {
                    System.out.println("Please enter a correct choice");
                    System.exit(0);
                }
            }
        }
        else{
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }

    }
}