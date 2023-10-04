package practice;

class Developer{
	public void code(Computer comp) {
		comp.code();
	}
}


interface Computer{
	//variable in interface are final and static
	//interface hhas no memory in heap , class that implement interface have memory
	String company="HP";
	public void code();
}

class Desktop implements Computer{
	public void code() {
		System.out.print("Code with Desktop");
	}
}

class Laptop implements Computer{
	public void code() {
		System.out.print("Code with Laptop");
	}
}

public class UsingInterface {
	public static void main(String[] arg) {
	Computer des =new Desktop();
	Computer lap =new Laptop();
	System.out.print(Computer.company);
	Developer dev =new Developer();
	dev.code(des);
	}
}