
public class MarathonClass2 {
    
    //int a = 10;
    //int b = 20;
    static int a = 10;
    static int b = 20;
        
    public static void addTwoNumber(int a,int b){//parameter
        
        //int c = this.a + this.b;
        int c = a + b;
        System.out.println(c);  
    }
    
    
    public static void main(String[] args) {
        
        //MarathonClass2 objVar = new MarathonClass2();
        //objVar.addTwoNumber();
        //new MarathonClass2().addTwoNumber();
        
        MarathonClass2.addTwoNumber(10,20);//argument
    }
    
}
