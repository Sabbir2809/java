
package Problem_Solving;

public class Triangle extends Shape{
        //dim1,dim2
    Triangle(double dim1,double dim2){
        super(dim1,dim2);
        //this.dim1 = dim1;
        //this.dim2 = dim2;        
    }
    void area(){
        double result = 0.5 * dim1 * dim2;
        System.out.println("Triangle area : "+result);
    }
     
}
