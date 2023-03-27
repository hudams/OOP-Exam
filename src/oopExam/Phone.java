package oopExam;

/*
 * Interface is a blue print of class 
 * All the methods declared in interface are abstract in nature 
 * Usually methods are declared here not implemented 
 * But, default and static type method can be implemented here from Java version 1.8
 * Default and static methods are non abstract methods 
 * Interface can inherit other interfaces by extends keyword
 * Interface can not inherit a regular class or abstract class 
 */

public interface Phone extends Pager, Wakitoki {

	public static final String phoneName = "Xaiomi";
	public static final int yearBuild = 1993;

	/*
	 * Interface can have variables But, variables can not be declared. It has to be
	 * initialized Variables are declared final in Interface which means this
	 * variables won't change Constructor is not allowed to create in Interface
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method from Phone Interface");
	}

	public static void wireless() {
		System.out.println("wireless is a static method from Phone Interface");
	}
}
