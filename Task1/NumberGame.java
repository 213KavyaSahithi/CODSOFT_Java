//TASK 1 - NUMBER GUESS GAME

/*1.Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won. */

import java.util.*;
public class NumberGame{
    static void guess(int score){
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;
        
        int attempts = 6;
        int n = (int)(Math.random()*(max-min+1)+min);
        for(int i=0;i<attempts;i++){
            System.out.println("Guess the number:"+" ");
            int n1 = input.nextInt();
            if(n1==n){
               System.out.println("Correct Guess");
               score++;
               break;
            }
            else{
                if(n1>n){
                  System.out.println("Too High!");
                }
                else if(n1<n){
                  System.out.println("Too Low!");
                }
            }
        }
        System.out.println("Do you want to play again(Enter 1 for Yes & 0 for No)?");
        int b = input.nextInt();
        if(b==1){
            guess(score);
        }
        else{
            System.out.println("Your Score is: "+score);
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------WELCOME TO NUMBER GUESS GAME-------------");
        System.out.println("INSTRUCTIONS:");
        System.out.println("1)You need to guess a number between 1 to 100");
        System.out.println("2)There will be 6 attempts for guessing the number");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter your name:");
        String a = input.nextLine();
        int score = 0;
        guess(score);
    }
}