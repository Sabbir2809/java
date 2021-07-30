
package stringinjava;

public class String1 {
    public static void main(String[] args) {
        
        //char st[] = {'H','i'};
        
        //String st = "Hi,I'm good.";
        //String s1 = new String("Bangladesh");
        /*
        String s1 = "Hi";
        String s2 = "Hi";
        if(s1.equals(s2)){
            System.out.println("They are equal.");
        }else{
            System.out.println("Not equal.");
        }
        
        int l = s2.length();
        
        System.out.println(s1.charAt(1));
        System.out.println(l);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());  
        */
        String s = "I Love   Bangladesh";
        
        String a[] = s.split("\\s+");
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
