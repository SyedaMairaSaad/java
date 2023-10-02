package practice;
enum LaptopDetail{
	MAC(2000),HP(150),Surface(120);
	private int price;
	
	LaptopDetail(int price){
		this.price=price;
	}	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
	}
}

public class EnumCode {
	public static void main(String[] arg) {
	LaptopDetail s=LaptopDetail.MAC;
	System.out.println(s);
	//below statment print in numeric form
	System.out.println(s.ordinal());
	
	//below statement gett all values in status enum in a array
	LaptopDetail[] sArray =LaptopDetail.values();
	
	for (LaptopDetail sVal:sArray) {
		System.out.println(sVal);
		System.out.println(sVal.ordinal());
	}
	
	
	
		//now let assume status s1 is comming from some functionality as an output
	LaptopDetail s1=LaptopDetail.MAC;
	
		switch(s1) {
		case MAC:
			System.out.println("MAC Book"+s1.getPrice());
			break;
		case HP:
			System.out.println("HP laptop");
			break;
		default:
			System.out.println("Surface ....");
			
		
		//enum by default extend enumclass
		System.out.println(s1.getClass().getSuperclass());
	}

	}
}
