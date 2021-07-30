
package string;

public class String5 {
    
    public static void main(String[] args) {
        
        String s1 = "Sabbir";
        StringBuffer sb = new StringBuffer(s1);//StringBuilder
        
        System.out.println(sb);
        
        sb.append(" Khan ");
        
        sb.append(25);
        
        sb.reverse();
        
        sb.delete(0, 2);
        
        System.out.println(sb);
        
        //sb.reverse();
        //System.out.println(sb);
        
        sb.delete(0,5);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
        
    }
    
}
