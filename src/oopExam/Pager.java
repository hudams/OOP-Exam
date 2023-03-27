package oopExam;

public interface Pager {

	public default void pager() {
		System.out.println("This is a default method from Pager interface");
	}
}
