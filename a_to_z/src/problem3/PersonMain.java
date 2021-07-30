
package problem3;

public class PersonMain {
    
    public static void main(String[] args){
        Address ads = new Address("Dhaka","Bangladesh");
        Teacher tr = new Teacher("Rafiqul Islam","017****85",ads,"Professor");
        Student st = new Student("Nurnobi Hosen","01770634816",ads,"183-15-11820",3.25);
 
        tr.display();
        st.display();
    }
}
