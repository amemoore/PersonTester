
public class Employee extends Person{
	
	private String socSecNum;
	
	public Employee(){
	}
	public String getSocSecNum() {
		return socSecNum;
	}
	public void setSocSecNum(String socSecNum) {
		this.socSecNum = socSecNum;
	}

//Over-riding abstract method in the Person class.
	@Override
	String getDisplayText() {
		return "You have entered the following information: \n" + 
				super.toString() + "\nSocial security number: " + socSecNum;
	}

}
