package Stringg;

public class Stringbuilder {
	
   public static void main(String args[])
   {
	   //it is mutable ,meaning it can be modified in place without creating new objects.
	   StringBuilder sb = new StringBuilder();
	   
	   for(int i=0 ; i<26 ; i++)
		{
			char ch = (char)('a'+i);
		    sb.append(ch);
		}
	   
	   System.out.println(sb.toString());
	   
	   sb.reverse();
	   
	   System.out.println(sb);
	   
   }

}
