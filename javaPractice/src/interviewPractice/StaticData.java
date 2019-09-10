package interviewPractice;

public class StaticData {

	static String name = "aanamika";
	
	String address = "tmpal";
	
	private static String school = "loyala";
	
	private String college = "psgTech";
	
	public String getCollegeName() {
		return college;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticData sd = new StaticData();
		System.out.println(name);
		System.out.println(sd.address);
		
		System.out.println(school);
		
		System.out.println(sd.college);
		
		System.out.println(sd.getCollegeName());
	}

}
