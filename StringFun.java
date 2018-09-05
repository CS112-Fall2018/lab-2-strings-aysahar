

public class StringFun 
{


	public static void main(String[] args)
	   {
		 String s = "We will be strong in the future";
	        String otherString = "No one is helping us";
	        String subString = "strong";
            
	        /* s.length() */
	        System.out.print("the word We will be strong in the future has "+s.length()+" letters");
	        /* s.equals(otherString)   */
	        if (s.equals(otherString)){
	        	System.out.println("The 2 string are exactly the same");
	        }else {	
	        	System.out.println("\nThe 2 string are different");
	        	}
	        /*s.substring(startIndex, endIndex)   */
	        System.out.println("The fourth letter to sixth letter of 'abracadabra' is "+ s.substring(3,6));
	        /*s.substring(startIndex, endIndex)   */
	        System.out.println(s.trim()); 
	        /*s.indexOf(subString)*/
	        System.out.println("Substring starts from "+s.indexOf(subString)+" Character in the string");
	        /*s.lastIndexOf(subString)*/
	        System.out.println("last subString in s is after "+s.lastIndexOf(subString)+ "th letter");
	        /*s.charAt(index)*/
	        System.out.println("The 7th letter in the string s is : "+s.charAt(6));
	       /*extra1 : s.toUppercase()  it makes the string all uppercase*/
	        System.out.println("make string all uppercase: " + s.toUpperCase());
	       /*extra2 : s.toLowercase() it makes all the index lower case*/
	        System.out.println("make string all lowercase: " + s.toLowerCase());
	   
	   }
}

