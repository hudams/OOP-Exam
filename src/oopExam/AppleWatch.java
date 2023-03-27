package oopExam;

/*
 * Abstract class can inherit regular class and a abstract class by extends keyword 
 * Abstract class can inherit Interface by implements keyword
 * Abstract class usually have declared methods which are abstract 
 * But, method implementation is possible when method is Static ONLY  
 * Abstract class can have variables declared and implemented
 * Can contain default and parameterized constructor 
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements DigitalWatch {

	public int seriesNumber = 5;

	public AppleWatch() {
		System.out.println("This is a deafult constructor from AppleWatch abstract class");
	}

	public void abstractClassInfo() {
		System.out.println("Abstract class can inherit regular class and a abstract class by extends keyword\n"
				+ "Abstract class can inherit Interface by implements keyword\n"
				+ "Abstract class usually have declared methods which are abstract\n"
				+ "But, method implementation is possible when method is Static ONLY\n"
				+ "Abstract class can have variables declared and implemented\n"
				+ "Can contain default and parameterized constructor ");
	}

	public static void appleWatchInfo() {
		System.out.println("This is a static method from AppleWatch abstract class");
	}

}
