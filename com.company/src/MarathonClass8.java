
public class MarathonClass8 {
    
    String[] alphabet = {"A","B","C","D","E","F","G","H"};
    
    public void forLoop(){
        
        for (int i = 0; i < alphabet.length; i++) {
            
            if(i == 2){
                continue;
            }
            if(i == 5){
                break;
            }
            System.out.println(alphabet[i]);
        }
        System.out.println("");
    }
    public void whileLoop(){
        
        int i = 0;
        while(i < alphabet.length){
            
            System.out.println(alphabet[i]);
            i++;          
            
        }
        System.out.println("");
    }
    public void doWhileLoop(){
        
        int i = 0;
        do{
          
          System.out.println(alphabet[i]);
          i++;  
          
        }while(i < alphabet.length);
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        MarathonClass8 obj=new MarathonClass8();
        
        obj.forLoop();
        obj.whileLoop();
        obj.doWhileLoop();
    }
    
}
