import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		
		System.out.println("Enter some text to decrypt.");
		Scanner keyboard = new Scanner(System.in);
		String str=keyboard.nextLine();
		while (!str.equals("stop")){

		
		str= str.toLowerCase();
		
		char chr = str.charAt(0);
		boolean upper = Character.isUpperCase(chr);
		
		
		char[] s = str.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    String strReverse = new String(s);

		
		for (int key=0; key<26; key++){
			String decrypted = "";
		 
		for(int i = 0; i < str.length(); i++){
			
		         {
		           char c = str.charAt(i);
		           if(Character.isDigit(c)){
		            	 c = (char) (c+(key%10));
		            	 if (c==':'){
		            		 c='0';
		            	 if (c==';'){
		            		 c='1';
		            		 }
		            	 }
		            	 if (c==':'){
		            		 c='0';
		            	 if (c==';'){
		            		 c='1';
		            		 }
		            	 if (c=='<'){
		            		 c='2';
		            	 }
		            	 }
		             }
		           else if(Character.isDefined(c)){
		        	   if (c==' '){
		        		   c=' ';
		        	   }
		        	   else
		        	   c=(char) (c+(key%26));
		        	   if (c>'z'){
		        		   c=(char) ((char) (c-key)+(key-26));
		        	   }
		        	   if (c==':'){
		            		 c='0';
		            	 if (c==';'){
		            		 c='1';
		            		 }
		            	 if (c=='<'){
		            		 c='2';
		            	 }
		            	 }
		           }
		           if (c==':'){
	            		 c='0';
		           		}
	            	if (c==';'){
	            		 c='1';
	            		 }
	            	 if (c=='<'){
	            		 c='2';
	            	 }
	            	 
		           decrypted = decrypted+c;
		         	}
		
				}
			if (upper=true){
				System.out.println(key+ ": " +decrypted.toUpperCase());
			}
			else
			System.out.println(key+ ": " +decrypted);
		}	
		
		System.out.println("");
		System.out.println("Would you like it reversed? y or n");
		System.out.println("");
		if(keyboard.nextLine().equals("y")){
		for (int key=0; key<26; key++){
			String decrypted2 = "";
		 
		for(int i = 0; i < strReverse.length(); i++){
			
		         {
		           char c = strReverse.charAt(i);
		           if(Character.isDigit(c)){
		            	 c = (char) (c+(key%10));
		            	 if (c==':'){
		            		 c='0';
		            	 }
		            	 if (c==';'){
			            	 c='1';
			            		 }
		            	 if (c==':'){
		            		 c='0';
		            	 if (c==';'){
		            		 c='1';
		            		 }
		            	 if (c=='<'){
		            		 c='2';
		            	 }
		            	 }
		            	 
		            	 
		             }
		           else if(Character.isDefined(c)){
		        	   if (c==' '){
		        		   c=' ';
		        	   }
		        	   else
		        	   c=(char) (c+(key%26));
		        	   if (c>'z'){
		        		   c=(char) ((char) (c-key)+(key-26));
		        	   }
		        	   if (c==':'){
		            		 c='0';
		            	 if (c==';'){
		            		 c='1';
		            		 }
		            	 if (c=='<'){
		            		 c='2';
		            	 }
		            	 }
		           }
		           if (c==':'){
	            		 c='0';
		           }
	            	 if (c==';'){
	            		 c='1';
	            		 }
	            	 if (c=='<'){
	            		 c='2';
	            	 }
	            	 
		           decrypted2 = decrypted2+c;
		         	}
		
				}
		if (upper=true){
			System.out.println(key+ ": " +decrypted2.toUpperCase());
		}
		else
		System.out.println(key+ ": " +decrypted2);
		}	
		}
		System.out.println("Enter something else to test or type stop.");
		str=keyboard.nextLine();
		}
	
	
	}
}	