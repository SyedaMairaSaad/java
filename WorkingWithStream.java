package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//in this code we are working to get sum of all the even numbers in our ArrayList
//Requirement: you have to double the number than sum it

public class WorkingWithStream {
	public static void main(String[] args) {
		//Array list of numbers
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10,13);
		
		//method 1 - using enhanced for loop
		int sum=0;
		for(int n:nums) {
			if(n%2==0) {
				n=n*2;
				sum=sum+n;
			}
		}	
		System.out.println(sum);
		
		//method 2 - using Stream API
		Stream<Integer> s1=nums.stream();
		Stream<Integer> s2=s1.filter(n->n%2==0);
		Stream<Integer> s3=s2.map(n->n*2);
		int result=s3.reduce(0,(c,e)->c+e);
		System.out.println(result);
		
		
		//method 3 - using Stream API write in one line
				int result2=nums.stream().filter(n->n%2==0).map(n->n*2)
						.reduce(0,(c,e)->c+e);
			
				System.out.println(result2);
	}

}
