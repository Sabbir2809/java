
package inheritance;

public class Son extends Father{//sub class
    
    String name = "Digital Bangladesh";
    
    public void mydata(){
        super.cal();
        System.out.println(super.name);//super class er kotha shunbe
        System.out.println(name);//sub class er kotha shunbe
    }
    
    @Override
    public void cal(){//methods override
        
        int a = 10;
        int b = 20;
        
        System.out.println(a*b);
    }
        
}
