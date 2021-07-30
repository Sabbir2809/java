/// For each loop
package Array;

public class Array3 {
    
    public static void main(String[] args) {
        
        //String[] name = new String[4];
        String[] name = {"Sabbir","komol","Safa","Salkin"};
        
        System.out.println(name.length);
        
        //name[0] = "Sabbir";
        //name[1] = "komol";
        //name[2] = "Safa";
       // name[3] = "Salkin";
        
        /*for (int i = 0; i < name.length; i++) {    
            System.out.println(name[i]);
        }
        */
        for(String x: name){
            System.out.println(x);
        }
    }
}
