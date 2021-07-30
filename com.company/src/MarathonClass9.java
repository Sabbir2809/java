
public class MarathonClass9 {
    
    String[] alphabet = {"A","B","C","D","E","F","G","H"};
    
    public void forEachLoop(){
        
        for(String s : alphabet){
            
            if(s == "D"){
                continue;
            }
            if(s == "G"){
                break;
            }
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        
        MarathonClass9 obj=new MarathonClass9();
        obj.forEachLoop();
    }
    
}
