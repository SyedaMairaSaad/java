package practice;
//import java.util.Arrays;
import java.util.Scanner;
public class anagramsStrings {
		static String sortString(String str) {
			// Converting string into an array for computation 
	        char arr[] = str.toCharArray();
	 
	        // Nested loops for comparison of characters
	        // in above character array
	       
	        char temp;
	 
	        int i = 0;
	        while (i < arr.length) {
	            int j = i + 1;
	            while (j < arr.length) {
	                if (arr[j] < arr[i]) {
	                   
	                    // Comparing the characters one by one
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	                j += 1;
	            }
	            i += 1;
	        }
	        return new String(arr);
		}
	    static boolean isAnagram(String a, String b) {
	        if(a.length()==b.length()){
	        	//char[] aChar=a.toLowerCase().toCharArray();
	        	//char[] bChar=b.toLowerCase().toCharArray().clone();
	            //Arrays.sort(aChar);
	        	//Arrays.sort(bChar);
	        	//return Arrays.equals(aChar, bChar);	
	        	String s1=sortString(a.toLowerCase());
	        	String s2=sortString(b.toLowerCase());
	        	if(s1.equals(s2))
	        		return true;
	        	 else 
	 	        	return false;        	    
	        	
	        }
	        else
	        	return false;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}
