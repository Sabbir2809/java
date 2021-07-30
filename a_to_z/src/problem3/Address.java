
package problem3;

public class Address {
    
    private String city;
    private String country;

    public Address(String city, String country) {
        
        this.city = city;
        this.country = country;
    }
    
    public void display(){
        System.out.println("City: "+city);
        System.out.println("Country: "+country);
    }
    
    
}