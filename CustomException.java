package practice;

class MyException extends Exception{
	String excep;
	MyException() {
		System.out.println("MY EXCEPTION");
		
	}
	
	MyException(String excep) {
		this.excep=excep;
		System.out.println(excep);
	}
}

public class CustomException {
	
	public static void main(String[] arg){
		int i=6;
		try {
			System.out.println("In Try going to throw exception (you can write conditions also)");
			if(i>5)
			throw new MyException();
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}

}
