package polymorsphism;

public class Multi {

public int multiplication (int a, int b) {
		
		int sum =a*b;
		return sum;
		
	}
	
	public float multiplication(int a, int b,float d){
		
		float sum =a*b*d;
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		Multi obj=new Multi();
	int	value=obj.multiplication(60, 10);
	
	
	System.out.println(value);
     float value1=obj.multiplication(10, 20, 8.10f);
	
	System.out.println(value1);
	
		
	}
	
}
