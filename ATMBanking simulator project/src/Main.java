import com.sun.tools.javac.Main;
import jdk.management.HotSpotAOTCacheMXBean;

import java.util.Scanner;

//1. ATM / Banking Simulator
//A CLI application that manages a user's account balance and transaction history.
//
//
//Key Concepts: while loop, switch case, arithmetic operators, Scanner.
//
//How It Works: Display a menu (1: Check Balance, 2: Deposit, 3: Withdraw, 4: View History, 5: Exit). Use a variable to track balance and a 1D array to log recent transaction amounts.
//Block withdrawals if the amount exceeds the current balance.
class ATMBankingSimulator{
    double balance = 0;
    int depostCount = 0;

    public static void main() {
        ATMBankingSimulator ob = new ATMBankingSimulator();
        boolean isCheck = true;
        while(isCheck){
            System.out.println("Choose Any from Given");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: withdraw");
            System.out.println("4: Exit");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option){
                case 1:
                    ob.CheckBalance();
                    break;
                case 2:
                    ob.Depost();
                    break;
                case 3:
                   ob.Withdraw();
                    break;
                case 4:
                    isCheck = true;
                    System.out.println("Thanks for using our ATM!");
                    break;
                default:
                    System.out.println("Your Enter wrong input try again.");

            }
        }
    }

     void Withdraw(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        double amount = input.nextDouble();
        if(amount > balance || amount< 0){
            System.out.println("Please Enter Correct amount From 0 to "+ balance);
        }else{
            balance = balance - amount;
            System.out.println("Congratulation your is succefully completed.");
        }
    }
 void Depost(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Depost amount: ");
        double amount = input.nextDouble();
        if (amount<0){
            System.out.println("please Enter amount greater then: 0");
        }else{
            balance = balance + amount;
            System.out.println("Congratualtion your Amount of "+amount+" is succesfuly Depost.");
            depostCount++;
        }

    }
    void CheckBalance() {

        System.out.println("your Current Balance is: "+ balance);

    }

}