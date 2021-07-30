
package overloading_method;

public class My {
    
    public void load(double a,double b){
        
        double ans = a+b;
        
        System.out.println(ans);
    }
    /*
    public void load(int x,int y,int z){
        
        int ans = x+y+z;
        System.out.println(ans);
        
    }
    */
    public void load(int x,int y){
        
        int ans = x+y;
        System.out.println(ans);
        
    }
}
