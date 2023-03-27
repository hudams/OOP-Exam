package oopExam;

// Static and final type of methods cannot be override

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public int materials(int ramprice, int cameraprice) {
		int price1 = ramprice + 4 + cameraprice;
		System.out.println("Total price for the materials is $" + price1);
		return price1;
	}

	@Override
	public int materials(int ramprice, int cameraprice, String ProcessorPrice) {
		int price2 = ramprice + cameraprice / 1 + Integer.parseInt(ProcessorPrice);
		System.out.println("Total price for the materials is $" + price2);
		return price2;
	}

	@Override
	public int materials(String ProcessorPrice, int ramprice, int cameraprice) {
		int price4 = Integer.parseInt(ProcessorPrice) * 2 + ramprice + cameraprice;
		System.out.println("Total price for the materials is $" + price4);
		return price4;
	}

	@Override
	public String materials(String ProcessorPrice, int ramprice, int cameraprice, int memory) {
		String total5 = String.valueOf(ramprice) + ProcessorPrice + String.valueOf(cameraprice)
				+ String.valueOf(memory);
		System.out.println("Total price for the materials is $" + total5);
		return total5;
	}
}
