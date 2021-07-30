
package beginnerjava;

public class FormatSpecifier {
    
        public static void main(String[] args) {
        
        boolean b= true;//Dynamic initialization
        char c='a';
        short s=32677;
        int i=126587;
        float f=10.2f;
        double d=10.2;
       
        System.out.printf("Boolean b = %b\n",b);
        
        System.out.printf("Characeter c = %c\n",c);
        
        System.out.printf("Shor s = %d\n",s);
        
        System.out.printf("Integer i = %d\n",i);
        
        System.out.printf("Float f = %.2f\n",f);
        
        System.out.printf("Double d = %.3f\n",d);
        
    }
    
}
