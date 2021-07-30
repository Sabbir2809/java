
package string;

public class String6 {
    
    public static void main(String[] args) {
        
        String s1 = "121";
        
        StringBuffer sb = new StringBuffer(s1);
        
        sb.reverse();
        
        if(s1.equals(sb)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
    
}
