
package Array;

import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int [][] A = new int[3][3];
        int sumOfDiagonalelements =0;
        int sumOfUpperelements =0;
        int sumOfLowerelements =0;
        
        //input a matrix
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                A[row][col] = input.nextInt();
            }
        }
        //diagonal matrix
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                if(row==col){
                    sumOfDiagonalelements =  sumOfDiagonalelements + A[row][col];
                }
                if(row<col){
                    sumOfUpperelements = sumOfUpperelements + A[row][col];
                }
                if(row>col){
                    sumOfLowerelements = sumOfLowerelements + A[row][col];
                }
            }
        }
        System.out.println("Sum of Diogonal Elements = "+sumOfDiagonalelements);
        System.out.println("Sum of Diogonal Elements = "+sumOfUpperelements);
        System.out.println("Sum of Diogonal Elements = "+sumOfLowerelements);
    }  
}
