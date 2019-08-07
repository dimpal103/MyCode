package constructor;

public class Employee {

	private int empId;
	private String empName;
	
	// parametrize constructor with two arguments
	public Employee(int a, String name) {
		this.empId = a;
		this.empName = name;
	}
	
	public int getEmployeeId() {
		return empId;
	}
	
	public String getEmployeeName() {
		return empName;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "anamika");
		Employee emp1 = new Employee(2, "dimpal");
		
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp1.getEmployeeId());
		System.out.println(emp1.getEmployeeName());

	}

}
