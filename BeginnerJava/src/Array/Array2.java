package Array;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        
        double sum = 0;

        System.out.print("Please Enter five number:");

        for (int i = 0; i < 5; i++) {
            
            number[i] = input.nextDouble();
            /*
         number[0] = input.nextDouble();//1
         number[1] = input.nextDouble();//2
         number[2] = input.nextDouble();//3
         number[3] = input.nextDouble();//4
         number[4] = input.nextDouble();//5
         */
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            //sum = number[0]+number[1]+number[2]+number[3]+number[4];
        }

        System.out.println("The sum is = " + sum);

        double avg = sum / number.length;
        System.out.println("The sum is = " + avg);
        
        double max = number[0];
        
        double min = number[0];
        
        for (int i = 1; i < 5; i++) {
            
            if(max<number[i]){
                
                max=number[i];
                
            }
            if(max>number[i]){
                min = number[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("MInimum = "+min);
    }
}
