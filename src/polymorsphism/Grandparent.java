package polymorsphism;


public class Grandparent {
	
	
	public int addition (int a, int b) {
		
		int sum =a+b;
		return sum;
		
	}
	
	public float addition(int a, int b,float d){
		
		float sum =a+b+d;
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		Grandparent obj=new Grandparent();
	int	value=obj.addition(60, 10);
	
	
	System.out.println(value);
     float value1=obj.addition(10, 20, 8.10f);
	
	System.out.println(value1);
	
		
	}
	
	
	
	

}
