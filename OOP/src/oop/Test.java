
package oop;

public class Test {
    
    public static void main(String[] args) {

        Teacher teacher1 =  new Teacher("Sabbir khan","male",182972365);//object declare or create
        teacher1.dispalyInformation();
        /*
        teacher1.name = "Sabbir khan";
        teacher1.gender = "male";
        teacher1.phone = 1829723692;
        -teacher1.setInformation("Sabbir khan","male",182972365);
        */
        
        Teacher teacher2 =  new Teacher("Shafa","femal",182972365);//object declare and create
        teacher2.dispalyInformation();
        /*
        teacher2.name = "shefa";
        teacher2.gender = "femal";
        teacher2.phone = 1829723622;
        -teacher2.setInformation("Shafa","femal",182972365);
        */
        
        Teacher teacher3 = new Teacher();
        teacher3.dispalyInformation();
    }
    
}
