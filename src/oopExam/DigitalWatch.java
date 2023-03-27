package oopExam;

public interface DigitalWatch {
	public default void digitalWatch() {
		System.out.println("This is a static method from digitalWatch Interface");
	}
}
