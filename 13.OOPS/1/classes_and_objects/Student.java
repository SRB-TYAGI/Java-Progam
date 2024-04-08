package classes_and_objects;

public class Student {
	public String name;
	private int rollNumber;
	
	public void setRollnumber(int rn) {
		if (rn <= 0) {
			return;
		}
		rollNumber = rn;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
}
