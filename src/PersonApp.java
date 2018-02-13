import java.util.Scanner;

/*Main application to run PersonTester - takes in several pieces of information and distinguishes between 
customer or employee, validates the info and prints back to screen.*/

public class PersonApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Weloome to the Person tester application");
		String custOrEmp = Validator.custOrEmp(sc,"Create customer or employee? (c/e): ");
		String firstName = Validator.getString(sc, "Enter first name: ");
		String lastName = Validator.getString(sc, "Enter last name: ");
		String email = Validator.validEmail(sc, "Enter email address: ");
		String emailReType = Validator.validEmailReType(email, sc, "Please re-enter email address: ");
		
		if (custOrEmp.equalsIgnoreCase("c")){
			int custNum = Validator.getInt(sc, "Enter customer number: ");
			Customer c = new Customer();
			c.setCustNumber(custNum);
			c.setEmail(email);
			c.setFirstName(firstName);
			c.setLastName(lastName);
			System.out.println(c.getDisplayText());
		}
		
		else if (custOrEmp.equalsIgnoreCase("e")){
			String socSecNum = Validator.validSocSec(sc, "Enter social security number: (xxx-xx-xxxx)");
			Employee e = new Employee();
			e.setEmail(email);
			e.setFirstName(firstName);
			e.setLastName(lastName);
			e.setSocSecNum(socSecNum);
			System.out.println(e.getDisplayText());
		}
	}
}

