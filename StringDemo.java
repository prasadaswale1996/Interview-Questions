package InterviewDemo;

import java.util.Arrays;

public class StringDemo {

public static void main(String[] args) {
		
		String str = "I am Indian citizen. I live in India. India has 27 states";
		
		String[] arrayOfStr;
		//split string sentence into array
		arrayOfStr = str.split(" ");
		System.out.println("Array of input string="+Arrays.toString(arrayOfStr));

		//sorting of array
		Arrays.sort(arrayOfStr);
		System.out.println(Arrays.toString(arrayOfStr));
	
		// word count
		for (int i=0; i<arrayOfStr.length; i++) {	
			for (int j=i+1; j<arrayOfStr.length; j++) {
				if (arrayOfStr[i] == arrayOfStr[j]) {
					System.out.println(arrayOfStr[j]);
				// not getting result
				}
			}
			
		}
		
		
		
	}

public static int wordCount() {
	
	
	
	
	
	return 0;
	
}


}



