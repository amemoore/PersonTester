//Using abstract class so that a 'Person' can not be instantiated.

public abstract class Person {

private String firstName;
private String lastName;
private String email;

public Person(){
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email2) {
	this.email = email2;
}

@Override
public String toString() {
	return "Name: " + firstName + " " + lastName + "\n" + 
			"Email: " + email;
}

/*Abstract method will be used in the inherited objects -
each object can call the same method for the purposes of displaying pertinent info.*/
abstract String getDisplayText();

}
