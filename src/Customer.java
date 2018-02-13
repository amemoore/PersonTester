
public class Customer extends Person {

	private int custNumber;
	
	public Customer(){
	}
	
	public int getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(int custNumber) {
		this.custNumber = custNumber;
	}

//Over-riding abstract method in the Person class.
	@Override
	String getDisplayText() {
		return "You have entered the following information: \n"  
				+super.toString() + "\nCustomer number: " + custNumber;
	}
}
