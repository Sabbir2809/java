
package string;

public class String2 {
    public static void main(String[] args) {
        
        String firstName = "Sabbir";
        String lastName = " Khan";
        
        String fullname = firstName + lastName;   
        System.out.println("Full Name = "+fullname);
        
        String fullName = firstName.concat(lastName);//concat
        System.out.println("Full name = "+fullname);
        
        String upperName = fullName.toUpperCase();
        System.out.println("upper name = "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("Lower name = "+lowerName);
        
        boolean b = firstName.startsWith("S");
        System.out.println("b = "+b);
        
        boolean last = lastName.endsWith("n");
        System.out.println("last = "+last);
        
        String[] names = {"sabbir","shafa","rubel"};
        
        for (String x : names) {
            
            System.out.println(x);
            
        }
        
    }
    
}
/*

concat();
toUpperCase();
toLowerCase();
startsWith();
endsWith();

*/