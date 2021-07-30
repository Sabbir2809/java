
package string;

public class String3 {
    
    public static void main(String[] args) {
        
        String country = "   Bangladesh is my country  ";
        
        String s3 = country.trim();
        System.out.println(s3);
        
        System.out.println(country);
        
        char ch = country.charAt(0);
        System.out.println("Ch = "+ch);
        
        int value = country.codePointAt(1);
        System.out.println("Value = "+value);
        
        int pos = country.indexOf("is");
        System.out.println("first position of : "+pos);
        
        pos = country.lastIndexOf("n");
        System.out.println("Last position of : "+pos);
        
        
    }
    
}
/*

trim();
charAt();
charPointAt();
indexOf();
lastlnexOf();
*/