
package problem_solving;

public class Box {
    
    double height,width,depth;//instance variable
    
    Box(double height,double width,double depth){//local variable
        /*
        height = h;
        width = w;
        depth = d;
        */
        this.height = height;//hiding instance variable
        this.width = width;
        this.depth = depth;
    }
    
    void displayVal(){
        
        double vol = height * width * depth;
        System.out.println("Voulume is : "+vol);   
    }
    
}
