package string;

public class StudentMark1 {

	private String name;
	private double internal1Mark;
	private double internal2Mark;
	private double internal3Mark;
	
	
	public StudentMark1(String line) {
		String[] str = line.split(",");
		
		name = str[0].trim();
		internal1Mark = Integer.parseInt(str[1].trim());
		internal2Mark = Integer.parseInt(str[2].trim());
		internal3Mark = Integer.parseInt(str[3].trim());
	}
	
	public String getName () {
		return name;
	}
	
	public double getInternal1Mark() {
		return internal1Mark;
	}
	
	public double getInternal2Mark() {
		return internal2Mark;
	}
	
	public double getInternal3Mark() {
		return internal3Mark;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMark1 studmark1 = new StudentMark1("Mukesh Kumar, 40, 50, 70");
		System.out.println(studmark1.getName()+" "+studmark1.getInternal1Mark()+" "+studmark1.internal2Mark+" "+studmark1.getInternal3Mark());
		

	}

}
