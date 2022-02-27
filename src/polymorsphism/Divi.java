package polymorsphism;

public class Divi {
	
public int division (int a, int b) {
		
		int sum =a/b;
		return sum;
		
	}
	
	public float division(int a, int b,float d){
		
		float sum =a/b/d;
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		 Divi obj=new  Divi();
	int	value=obj.division(60, 10);
	
	
	System.out.println(value);
     float value1=obj.division(10, 20, 8.10f);
	
	System.out.println(value1);
	
		
	}
	
	
	
	
	
	
	
	
	

}
