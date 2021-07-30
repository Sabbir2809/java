
package abstractClass_method;

public abstract class Father {//abstract key use korle tahole sorasori oi class er object banate pari na
    
    public void addTwo(){
        
        System.out.println(10+20);
    }
    /*
    public void name(String s){//method-abstract er body part thakbe na
            System.out.println(s);
    }
    */
    public abstract void name(String s);
    public abstract void Age(int a);
}
