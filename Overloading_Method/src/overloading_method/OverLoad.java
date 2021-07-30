
package overloading_method;

public class OverLoad {//polymorphism(run time,compiler )
    
    void add(int a,int b){// add(5,10);
        System.out.println(a+b);
    }
    void add(double a,double b){// add(5.5,10.5);
        System.out.println(a+b);
    }
    void add(int a,int b,int c){//// add(5,10,15);
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Nothing to add");
    }
    
}
/*condition
1. same method names
2. parameter lists are different
3. inside the same class
*/