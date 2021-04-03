package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private static int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public static void main(String[] args) {

	}

	public int GetIR() {
		return itemsReceived;
	}

	public void SetIR(int itemsReceived) {

		if (itemsReceived >= 0) {
			this.itemsReceived = itemsReceived;
		} else {
			itemsReceived = 0;
		}

	}

	public float GetDT() {
		return degreesTurned;
	}

	public void SetDT(float dt) {
		if (dt >= 0.0 && dt <= 360.0) {
			this.degreesTurned = dt;
		}
		else {
			System.out.println("need to enter another number");
		}
	}
	public String GetNC() {
		return nomenclature;
	}
	public void SetNC(String nc) {
		if(nc.equals("")) {
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = nc;
		}
	}
	public Object GetMO() {
		return memberObj;
	}
	public void SetMO(Object mo) {
		if(mo instanceof String) {
			this.memberObj = new Object();
			
		}
		else {
			this.memberObj = mo;
		}
	}
}