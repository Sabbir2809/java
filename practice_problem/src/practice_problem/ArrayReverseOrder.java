//Write a program in java to print the elements of an array in reverse orderForum.
package practice_problem;

public class ArrayReverseOrder {
    
    public static void main(String[] args) {
        
        int[] array = new int[]{50,60,70,80,90,100};
        
        System.out.println("Array : ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        System.out.println("");
        
        System.out.println("Reverse Array: ");
        
        for (int i = array.length-1; i > 0; i--) {
            
            System.out.print(array[i]+" ");
        }
    }  
}
