public class Pr1 
{
	public static void main(String args[]) 
       {
		//DECLARE STRING
		String str = "Hello World";
		int temp;
		//Converts the  string into a sequence of characters
		char[] strArr = str.toCharArray();
		
		System.out.println("------LOGICAL AND--------- \n");
		//Final we will perform Logical AND Operation on sequence of Char with 127 value
		int i;
		char c;
		for (i=0;i<str.length();i++) 
              {
                     temp =  strArr[i] & 127;
			c =(char)temp; //Converting ASCII value to Character
			System.out.println("Character ("+str.charAt(i)+") & "+"(127): "+(c));
		}
		
		System.out.println("\n\n\n");
		
		System.out.println("------LOGICAL OR--------- \n");
		//Final we will perform Logical AND Operation on sequence of Char with 127 value
		for (i=0;i<str.length();i++) 
              {
			temp =  strArr[i] ^ 127;
			c =(char)temp; //Converting ASCII value to Character
			System.out.println("Character ("+str.charAt(i)+") ^ "+"(127): "+(c));
		}

	}
}
