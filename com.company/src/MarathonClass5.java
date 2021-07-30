
public final class MarathonClass5 {
    
    public MarathonClass5(String name){
        System.out.println(name);
    }
    public MarathonClass5(String n,String t){
        System.out.println(n+" "+t);
    }
    
    public MarathonClass5(){
        method1();
        method2();
        method3();
        method4();
    }
    
    
    public void method1(){
        System.out.println("I am Methon 1");
    }
    public void method2(){
        System.out.println("I am Methon 2");
    }
    public void method3(){
        System.out.println("I am Methon 3");
    }
    public void method4(){
        System.out.println("I am Methon 4");
    }
    
    public static void main(String[] args) {
        
        MarathonClass5 obj1 = new MarathonClass5();
        
        MarathonClass5 obj3   = new MarathonClass5("Sabbir");
        
        MarathonClass5 obj2 = new MarathonClass5("Sabbir Khan","Zahid ");
    }
    
}
