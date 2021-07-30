
package Array;

public class Array1 {

    public static void main(String[] args) {
        
        //int num1;
        //String name;
        
        int[] number = new int[20];
        int[] number3 = new int[10];
        
        //int[] number1;
        //number1 = new int[5];
        
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        
        int sum= number[2]+number[4];
        
        System.out.println("sum is = "+sum);
        
        System.out.println(number[0]);
        
        int len = number3.length;
        
        System.out.println("array size:"+len); 
    } 
}
