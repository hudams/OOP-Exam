package oopExam;

//Inheritance concept is used to relate to Iphone1 to Iphone6

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println("Compass feature added to Iphone 6");
	}

	/*
	 * Method overloading is same method name for multiple methods with different
	 * parameter orientation Method overloading happens during compile time
	 * 
	 * Method overriding is same method name & parameter for multiple methods but
	 * logic is different from each method Method overriding happens during run time
	 * Also known as dynamic polymorphism
	 */

	public final void materials() {
		System.out.println("This is a void overloading method from Iphone6 class");
	}

	public int materials(int ramprice, int cameraprice) {
		int price1 = ramprice + cameraprice;
		System.out.println("Total price for the materials is $" + price1);
		return price1;
	}

	public int materials(int ramprice, int cameraprice, String ProcessorPrice) {
		int price2 = ramprice + cameraprice + Integer.parseInt(ProcessorPrice);
		System.out.println("Total price for the materials is $" + price2);
		return price2;
	}

	public static int materials(int ramprice, String ProcessorPrice, int cameraprice) {
		int price3 = ramprice + Integer.parseInt(ProcessorPrice) + cameraprice;
		System.out.println("Total price for the materials is $" + price3);
		return price3;
	}

	public int materials(String ProcessorPrice, int ramprice, int cameraprice) {
		int price4 = Integer.parseInt(ProcessorPrice) + ramprice + cameraprice;
		System.out.println("Total price for the materials is $" + price4);
		return price4;
	}

	public String materials(String ProcessorPrice, int ramprice, int cameraprice, int memory) {
		String total5 = ProcessorPrice + String.valueOf(ramprice) + String.valueOf(cameraprice)
				+ String.valueOf(memory);
		System.out.println("Total price for the materials is $" + total5);
		return total5;
	}

}
