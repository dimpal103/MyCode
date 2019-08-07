package string_Bhaiya;

public class StudentMarks {

	private String name;
	
	public StudentMarks(String name1) {
		name = name1;
	}
	
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentMarks sm = new StudentMarks("dimpal");
		System.out.println(sm.getName());
	}

}
