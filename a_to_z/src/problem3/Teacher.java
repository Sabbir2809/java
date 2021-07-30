
package problem3;

class Teacher {
    
    private String designation;

	public Teacher(String name,String phone,Address address,String designation)
	{
		super(name,phone,address);
		this.designation=designation;
	}
	public void display()
	{
		super.display();
		System.out.println("Techer Designation :"+designation);
	}
}
    
}
