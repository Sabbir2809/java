
package methodinjava;

public class Method {
    
    public static void main(String[] args) {
        
        System.out.println("Program Start: ");
        sayHi();
        
        
    }
    int getSum(int x,int y){
        
        int sum = x + y;
        
        return sum;
    }
    
    static void sayHi(){
        System.out.println("Hi");
    }
    
}
/*

Method in Java (4 important things)

1.Method name
2.input/arguments/parameters
3.return data type
4. method body

return_data_type method_name(input1,input2){


return result;
}

*/