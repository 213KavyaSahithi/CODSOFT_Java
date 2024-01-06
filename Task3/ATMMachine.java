// TASK 3 - ATM INTERFACE

/*1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions */

import java.util.*;
public class ATMMachine{
    static int availbalance=1000;
    static void withdraw(int amount){
        if(availbalance>=amount){
            System.out.println("Transaction Successful");
            availbalance-=amount;
        }
        else{
            System.out.println("Transaction unsuccessful");
            System.out.println("You don't have sufficient balance in your account");
        }
    }
    static void depositamount(int amount){
        availbalance+=amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Available balance in the account: "+availbalance);
    }
    static void checkBalance(){
        System.out.println("Available balance in the account: "+availbalance);
    }

    static void run(){
        Scanner input = new Scanner(System.in);
        int a;
        do{
            System.out.println("-------------WELCOME TO ABC BANK ATM-------------");
            System.out.println("Please insert your ATM card");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------------------");
            System.out.println("Which operation needs to be performed:");
            a = input.nextInt();
            switch(a){
                case 1: System.out.println("Enter the amount to be withdrawed:");
                        int n = input.nextInt();
                        withdraw(n);
                        break;
                case 2: System.out.println("Enter the amount needs to be deposited:");
                        int n1 = input.nextInt();
                        depositamount(n1);
                        break;
                case 3: checkBalance();
                        break;
                case 4: System.out.println("Exiting...");
                        break;
                default:System.out.println("Enter valid option");
            }
        }while(a!=4);
    }
    public static void main(String args[]){
        run();
    }
}