package imp2Array;

public class ReveseString {//Using charAt() method
	
	
	//reverse of a string program in java with eplain
	
	
		public static void main(String[] args) {

		String str = "ABC";

		String rev = ""; //reversed string will be stored in reverse variable

		for (int i = str.length() - 1; i >= 0; i--) {  //length of string will be stored in i

			rev = rev + str.charAt(i);   //Iterate through the string from last and add each character to variable reversedStr    

		}

		System.out.println(rev);
	}

}
      //By StringBuilder / 
       //public class StringFormatter {  
        //public static String reverseString(String str){  

        //StringBuilder sb=new StringBuilder(str);  
        //sb.reverse();  
       // return sb.toString();  
 
 
//StringBuffer
        //public class TestStringFormatter {  
        //public static void main(String[] args) {  

  //  System.out.println(StringFormatter.reverseString("my name is khan"));  
  //  System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));      
    
