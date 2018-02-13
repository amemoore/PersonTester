
import java.util.Scanner;

public class Validator
{
    public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

//Very basic email validation - testing for the @ symbol.
    public static String validEmail(Scanner sc, String prompt){
	    String EMAIL_REGEX = "^(.+)@(.+)$";
	    String email1;
	    System.out.println(prompt);
 	    email1 = sc.next();
	    Boolean b=false;
	    boolean isValid = false;
        while (isValid == false){
     	    b = email1.matches(EMAIL_REGEX);
		    if (b==true){
		    	System.out.println("Valid email.");
		    	isValid=true;
		    }
		    else{
		    	System.out.println("Invalid Input");
		    	System.out.println(prompt);
	     	    email1 = sc.next();
		    }
        }
	    return email1;
    }

//Confirming that the email was re-typed correctly.
    public static String validEmailReType(String s, Scanner sc, String prompt){
    	String emailReType="";
	 	boolean isValid = false;
	        while (isValid == false){
	        	System.out.println(prompt);
	    	 	emailReType = sc.next();
				    if (s.equals(emailReType)){
			    	System.out.println("Email confirmed.");
			    	isValid=true;
				    }
				    else{
				    	System.out.println("Invalid Input");
				    }
        }
	    return emailReType;
    }
 
//Validating the 'c' or 'e' input.
    public static String custOrEmp(Scanner sc, String prompt){
        String s="";
        boolean isValid = false;
        while (isValid == false){
        	System.out.print(prompt);
            s = sc.next();  // read user entry
            sc.nextLine();  // discard any other data entered on the line
		        if ((s.equalsIgnoreCase("c"))||(s.equalsIgnoreCase("e"))){
		        	isValid=true;
		        }
		        else
		        	System.out.println("Invalid input. Please enter 'c' for customer or 'e' for employee.");
	    }
        return s;
    }

    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
    
    public static String validSocSec(Scanner sc, String prompt){
	    String socSecRegEx = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
    	String socSecNum="";
	    boolean isValid = false;
        while (isValid == false){
        	System.out.println(prompt);
     	    socSecNum = sc.next();
	        	if (socSecNum.matches(socSecRegEx)){
			    	isValid=true;
			    }
			    else{
			    	System.out.println("Invalid Input");
			    }
        }
	    return socSecNum;
    }   
}







