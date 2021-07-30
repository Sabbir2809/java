
import java.util.Scanner;


public class MarathonClass4 {
    /*
    public static void addTwoNumber(int a,int b){//data type change kore return type change kore
     
        System.out.println(a+b);
    }
    public static void addTwoNumber(int a,int b,int c){
        
        System.out.println(a+b+c);     
        
    }
    */
    public void addTwoNumber(){
        
        double x = 10.55;
        double y = 20.55;
        
        double sum = x + y;
        
        System.out.println(sum);
    }
    public static MarathonClass4 classMethod(){
        
        MarathonClass4 obj=new MarathonClass4();
        
        return obj;
    }
    
    public static void main(String[] args) {
        
        //MarathonClass4.addTwoNumber(10, 20);
       // MarathonClass4.addTwoNumber(10, 20, 30);
        
        //double z = MarathonClass4.addTwoNumber();
        //System.out.println(z);
        
       MarathonClass4 obj= MarathonClass4.classMethod();
       obj.addTwoNumber(); 
       
    }
    
}
