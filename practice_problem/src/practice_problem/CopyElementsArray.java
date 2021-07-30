//Write a Java program Java Program to copy all elements of one array into another array.
package practice_problem;

public class CopyElementsArray {
    
    public static void main(String[] args) {
           
        int [] array_first = new int [] {1, 2, 3, 4, 5};
        int array_second[] = new int[array_first.length];    
        
        for (int i = 0; i < array_first.length; i++) {   
            
            array_second[i] = array_first[i];     
        }      
        
        System.out.print("Array: ");    
        for (int i = 0; i < array_first.length; i++) {
            
           System.out.print(array_first[i] + " ");    
        }     
        System.out.println("");
        
        System.out.print("Copy Array: ");    
        for (int i = 0; i < array_second.length; i++) {
            
           System.out.print(array_second[i] + " ");    
        }     
    }   
}
