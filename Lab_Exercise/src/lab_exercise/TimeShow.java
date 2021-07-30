
package lab_exercise;

public class TimeShow {
    
    private int second,minute,hour;
    
    TimeShow(){
        System.out.println("Default");
        
    }
    TimeShow(int s,String m,double h){
        System.out.println("Different Values");        
    }
    TimeShow(int second,int minute,int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    void display(){
        System.out.println(second+":"+minute+":"+hour+":");
    }
    static class TimeExple{
        public static void main(String[] args) {
            TimeShow obj1 = new TimeShow();
            TimeShow obj2 = new TimeShow(10,"BK",3.1416);
            TimeShow obj3 = new TimeShow(60,52,10);
            obj3.display();
        }
    }
    
}
