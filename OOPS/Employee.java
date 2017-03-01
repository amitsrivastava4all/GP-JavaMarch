/*
 * OOPS - Class and Object
 * Encapsulation - Binding data (variables) and methods (functions)
 * into a single unit is called Encapsulation
 * e.g class is an example of Encapsulation
 * Good Encapsulation - making private instance variables and public instance methods
 * OOAD - S O L I D
 * S - SRP (Single Responsiblity Principal)
 * D - DRY (Don't Repeat YourSelf)
 */
public class Employee {
	// private - access with in the class
	// Data Hiding
	private int id; // Instance Variables
	private String name;
	private double salary;
	private String companyName;
	private String phone;
	private String pinCode;
	private String city;
	private String managerName;
	private String deptName;
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	void Employee(){
		System.out.println(" i am not a constructor , i am method");
	}
	/*
	 * Constructor 
	 * It is call when u create an object
	 * it is used to initalize the instance variables
	 * the name of constructor is same as class name
	 * constructor never return anything
	 */
	// Constructor Overloading
	public Employee(){
		//this(1001,"RAM",5555);
		companyName="GenPac";
	}
	
	public Employee(int id, String name, double salary)
	{
		this();  // Calling Default Constructor
		this.id = id + companyName.length();
		this.name = name;
		this.salary =salary;
		//this();
	}
	
	private boolean isValid(double value){
		return value>0?true:false;
	}
	
	public void takeInput(int id , String name, double salary){
		//Instance Variable = local variable
		if(isValid(id) && isValid(salary)){
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Data , Can't Take it");
		}
	}
	
	public void print(){
		// when u call ram.print() , ram reference is copy into
		// a special keyword called this
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
		
		
		
	}
	
}
