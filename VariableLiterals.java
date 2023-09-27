package practice;
//We are going to work with variables and literals
//variable is a box where you store a value
//literals are is format of value like storing number but in binary form or hexa-decimal format
public class VariableLiterals {
	public static void main(String[] arg) {
		//there are 2 types of variable
		//1- Primitive
		//2- Wrapper
		//We discuss Primitive
		//byte- it is 1 byte numeric value primitive type (Stores whole numbers from -128 to 127)
		byte b=127;
		//short-2 bytes	Stores whole numbers from -32,768 to 32,767
		short s=223;
		//int-	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		int i=256;
		//long-	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//it is necessary to mention l with literal
		long l=1290l;
		//float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		//it is necessary to mention f with literal
		float f= 2.54f;
		//double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		double d=2.3;
		//boolean	1 bit	Stores true or false values
		// contain only true or false (0 and 1 is not there in java)
		boolean bol=false;
		//char	2 bytes	Stores a single character/letter or ASCII values
        //char allow single character , in char  single quote is used
		// in java char is of 2 byte to allow other language character as an literal
		char c='a';	
		//Below statement is used to simply print value contain in variable
		//print() is used to print on same line
		//to print on different line(line break) println is use
		System.out.print("Printing float"+f);
		//+ is use to concatenate two values- to join 
		//choosing right variable type is important for efficient memory usage
	}

}
