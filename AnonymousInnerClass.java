package practice;
class A{
	
	public void show() {
		System.out.print("I am in A show");
	}
}

public class AnonymousInnerClass {
	public static void main(String[] arg){
		// below mention code create anonymous class
		//this anonymous class is under AnonymousInnerClass class thherefore called anonymous inner class
		//anonymous mean without name
	A obj=new A() {
		public void show() {
			System.out.print("I am in new show");
		}
		
	};
	obj.show();
	}
	
}
	
	


