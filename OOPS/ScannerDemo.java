import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Name "+name+" Age "+age+" Salary "+salary);
		scanner.close();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the City");
		String city = s.next();
		System.out.println("City is "+city);
		
	}

}
