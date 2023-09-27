package practice;

//This code we discuss type Conversion
public class TypeConversion {
	public static void main(String[] arg) {
		int i = 127;
		byte b = 2;
		// Assigning value of smaller data type to bigger one is possible by below code
		// this is implicit conversion of type
		i = b;
		// But assigning Small data type to bigger one is not possible
		// below statement (commented) give compiler error
		// b=i;
		// If we still want to convert int to byte we can use explicit type conversion
		// called CASTING
		// below is the code for type casting
		// casting small range int to byte give you similiar result
		// on the othe hand if int value is larger than byte range , then modular will
		// be performed
		i = 257;
		b = (byte) i;
		// in below case modular will be perform and results 1
		System.out.print(b);
	}
}
