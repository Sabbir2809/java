
package string;

public class String1 {
    
    public static void main(String[] args) {
        
        String s1 = "sabbir Khan";
        String s2 = new String("Sabbir Khan");
        //char[] s3 = {'s','a','b','b','i','r'};
        //System.out.println(s3);
        
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of s1 = "+len);
        
        System.out.println("");
        
        if(s1.equals(s2)){//contains // ===
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s1.equalsIgnoreCase(s2)){//contains // ===
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        boolean con = s1.contains("sabbir");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
            
    }
    
}
/*

length();
equals();
equalslgnoreCase();
contains();
isEmpty


*/