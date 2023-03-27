package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.
 */

public class Iphone2 extends Iphone1 {
	public char userOfIphone2 = 'M';

	public Iphone2() {
		super();
		super.getPrice();
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.forIphone2 = "iphone 1 public string";
	}

	public Iphone2(char userOfIphone2) {
		super(200, "iphone 1", 'M', false);
		this.userOfIphone2 = userOfIphone2;
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.regularClassInfo();
		super.forIphone2 = "iphone 1 public string";
	}

	public void iphone2Info() {
		System.out.println("This is a void method from Iphone2 class");
	}

	public void iphone2Info(char userOfIphone2) {
		System.out.println("This is a parameterized method from Iphone2 class");
	}

	/*
	 * 1) In IPhone2, Initialize a char variable userOfIphone2 (M or F). create
	 * default and parameterized constructor, a void type method iPhone2Info, a
	 * parameterized method with same name iPhone2Info inside Iphone2 class. Use the
	 * super method and super keyword in constructor, and super keyword in methods
	 * of Iphone2. Call constructor and methods. Can you call variable by super
	 * keyword? create a public variable inside Iphone1 and execute it in Iphone2.
	 * Execute all of them in TestPhone. [points: 70]
	 */

	public void dropBox() {
		System.out.println("DropBox is cloud storage that stores the data");
	}

}
