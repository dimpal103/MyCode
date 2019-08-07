
public class SperAndThis {
	
	SperAndThis() {
		

		System.out.println("Printed A");
		
	}
	

	class B extends SperAndThis {
		B() {
			
			super();
			System.out.println("Printed B");
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SperAndThis ss = new SperAndThis();
		
		//System.out.println(bb);
		
		
	}

}
