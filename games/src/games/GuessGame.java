package games;

import java.util.Random;

import java.util.Scanner;

public class GuessGame {  
    
    public static void main(String[] args) {
        
        while(true){
            
            int guessNumber;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter Your Guess between 1 to 5: ");
            guessNumber = input.nextInt();
            
            Random  rand = new Random();
            int randomNumber = rand.nextInt(5) + 1;
            
            if(guessNumber == randomNumber){
                System.out.println("You have Won.");
                System.out.println("");
            }
            else{
                System.out.println("You have lost,try again!");
                System.out.println("Random Number was: "+randomNumber);
                System.out.println("");
            }         
        }     
    }   
}
