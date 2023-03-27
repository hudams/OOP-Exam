package oopExam;

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public String forIphone2;

	public Iphone1() {
		System.out.println("This is a default constructor of Iphone1 class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	public int getPrice() {
		return price;
	}

	/*
	 * public void setPrice(int price) { this.price = price; }
	 */

	public String getInfo() {
		return info;
	}

	/*
	 * public void setInfo(String info) { this.info = info; }
	 */

	public char getUser() {
		return user;
	}

	/*
	 * public void setUser(char user) { this.user = user; }
	 */

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	/*
	 * public void setMadeInUSA(boolean madeInUSA) { this.madeInUSA = madeInUSA; }
	 */

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	public void regularClassInfo() {
		System.out.println("A regular class can inherit another regular or a abstract class by extends keyword\n"
				+ "A regular class can inherit another Interface by implements keyword\n"
				+ "Only, method can be implemented in regular class which is non abstract method. Method declares in not allowed\n"
				+ "But, we can call abstract methods which are declared");
	}

	public void youTube() {
		System.out.println("YouTube is a free straming video application");
	}

}
