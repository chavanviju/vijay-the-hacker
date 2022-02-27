package polymorsphism;

public class Sub {

	
public int subtraction (int a, int b) {
		
		int sub =a-b;
		return sub;
		
	}
	
	public float subtraction(int a, int b,float d){
		
		float sub =a-b-d;
		return sub;
		
	}
	
	
	public static void main(String[] args) {
		Sub obj=new Sub();
	int	value=obj.subtraction(60, 10);
	
	
	System.out.println(value);
     float value1=obj.subtraction(10, 20, 8.10f);
	
	System.out.println(value1);
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
