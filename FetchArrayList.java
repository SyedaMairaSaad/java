package practice;
/** we will see different methods to fetch data from arrayList**/

import java.util.Arrays;
import java.util.List;

public class FetchArrayList {
	public static void main(String[] arg) {
		List<Integer> nums=Arrays.asList(41,2,3,4,5,6);
		
		//method 1- simple for loop
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		//method 2 - enhanced for loop
				for(int n:nums) {
					System.out.println(n);
				}
				
		//method 3 - forearc
		nums.forEach(no->System.out.println(no));
	}

}
