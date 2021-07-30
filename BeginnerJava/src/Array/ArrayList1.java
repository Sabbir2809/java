
package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    
    public static void main(String[] args) {
        
       // int a[] = new int[3];
       // int [] a1 = new int[3];
        
        ArrayList <Integer> number = new ArrayList <>();
        
        System.out.println("Size = "+number.size());
        
        //adding elements
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println(number);
        System.out.println("Size = "+number.size());
        
        for (int x : number) {
            System.out.println(" "+x);
            
        }
        System.out.println("");
        
        Iterator itr = number.iterator();
        
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }

        number.remove(2);
        System.out.println("after removing arrayList continue : "+number);
        number.removeAll(number);
        System.out.println("  "+number);
    }
    
}
