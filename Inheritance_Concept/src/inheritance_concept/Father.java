
package inheritance_concept;

public class Father {//super class
    
    public int a = 20;
    public int b = 10;
    public int c;
    
    public void Add(){
        
        this.c = this.a+ this.b;
        System.out.println(this.c);
    }
 
}
