package privateconcept;

public class PrivateData {
	
	 String name = "dimpal";
	 int age = 20;
	 String address = "Bangalore";
	
	public void display() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	public int getAge() {
		return age;
	}
	
	

	
	class Aaa extends PrivateData {
		
		public void display2() {
			int age = 80;
			System.out.println("age :"+age);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateData pd = new PrivateData();
		System.out.println(pd);
		
		//System.out.println(pd.name);
		
		//System.out.println(pd.age);
		
		//System.out.println(pd.address);
		
		pd.display();
	
		
		
	}

}
