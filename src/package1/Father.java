package package1;

public class Father {
	
	
	private void FatherATM() {

		System.out.println("This is private specifier method");

	}

	public void bike() {

		System.out.println("This is public specifier method ");

	}

	void test() {

		System.out.println("This is default specifier method ");
	}
	
	protected void test1() {
		
		System.out.println("hello protected");
	}
	
	

	public static void main(String[] args) {

		Father obj = new Father();

		obj.FatherATM();
		
		obj.bike();
		obj.test();
		obj.test1();
		
		
		
		
		
	}
}
