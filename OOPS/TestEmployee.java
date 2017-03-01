
public class TestEmployee {

	public static void main(String[] args) {
		
		int x =100;
		// new Employee() will create an instance of Employee
		Employee ram = new Employee(1001,"Ram",9999) ;
		ram.setSalary(ram.getSalary() + 2000);
		System.out.println("Now "+ram.getName()+" Salary is "+ram.getSalary());
		//ram = new Employee();
//		ram.id  = -1001;
//		ram.name = "Ram";
//		ram.salary = -9999;
		//ram.isValid(-1901);
		//ram.takeInput(-1001, "Ram", 9999);
		//ram.print();
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		
		System.out.println("*****************************");
		Employee shyam = new Employee(1002,"Shyam",6666);
		//shyam.takeInput(1002, "Shyam", 8888);
//		shyam.id = 1002;
//		shyam.name = "Shyam";
//		shyam.salary = 5454;
		shyam.print();
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.salary);

	}

}
