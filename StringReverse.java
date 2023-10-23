package practice;

import java.util.Scanner;

//Given a string , print Yes if it is a palindrome, print No otherwise.
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		if (s.equals(sb.reverse().toString()))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
