package practice;

public class NewSwitch {
	public static void main(String[] arg) {
		String day="monday";
		String result="";
		
		result=switch(day) {
		case "monday"-> "Welcome to Office after weekend";
		case "saturday","sunday"-> "Happy weekend";
		default->"Normal working day";
		};
		
		System.out.print(result);
	}

}
