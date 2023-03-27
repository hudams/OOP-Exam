package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("------------ Iphone 1 objects are being called ------------");
		Iphone1 iphone1 = new Iphone1();
		iphone1.regularClassInfo();
		iphone1.abstractClassInfo();
		Iphone1.appleWatchInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.battery();
		Iphone1 iph = new Iphone1(750, "iphone 1", 'M', false);
		System.out.println("I bought " + iph.getInfo() + " in 2000, the price was" + iph.getPrice() + "$, user's sex: "
				+ iph.getUser() + ", and boolean value for made in USA is: " + iph.isMadeInUSA());

		System.out.println("\n------------ Iphone 2 objects are being called ------------");
		Iphone2 iphone2 = new Iphone2();
		iphone2.iphone2Info();
		iphone2.iphone2Info('M');
		iphone2.dropBox();
		iphone2.getPrice();
		iphone2.getInfo();
		iphone2.getPrice();
		iphone2.getUser();
		iphone2.userOfIphone2 = 'M';
		iphone2.forIphone2 = "This is a public string from Iphone 1 class";
		iphone2.interfaceInfo();
		iphone2.call();
		iphone2.message();
		iphone2.camera();
		iphone2.regularClassInfo();
		iphone2.youTube();
		Iphone2.appleWatchInfo();
		iphone2.abstractClassInfo();
		iphone2.seriesNumber = 5;
		iphone2.appleWatchSeries5();
		iphone2.digitalWatch();
		iphone2.battery();
		iphone2.pager();
		iphone2.wakitoki();

		System.out.println("\n------------ Apple Watch objects are being called ------------");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		AppleWatch.appleWatchInfo();
		appleWatch.appleWatchSeries5();
		appleWatch.digitalWatch();

		System.out.println("\n------------ Phone objects are being called ------------");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		Phone.wireless();
		phone.pager();
		phone.wakitoki();

		System.out.println("\n------------ Iphone 6 objects aren being called ------------");
		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iphone2Info();
		iphone6.iphone2Info('M');
		iphone6.userOfIphone2 = 'M';
		iphone6.dropBox();
		iphone6.getPrice();
		iphone6.getInfo();
		iphone6.getUser();
		iphone6.isMadeInUSA();
		iphone6.regularClassInfo();
		iphone6.youTube();
		iphone6.forIphone2 = "This is a public string from Iphone 2";
		iphone6.abstractClassInfo();
		Iphone6.appleWatchInfo();
		iphone6.seriesNumber = 5;
		iphone6.appleWatchSeries5();
		iphone6.digitalWatch();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.battery();
		iphone6.pager();
		iphone6.wakitoki();
		iphone6.materials();
		iphone6.materials(700, 800);
		iphone6.materials(750, 77, "455");
		iphone6.materials("23", 85, 66);
		iphone6.materials("03", 57, 94, 34);
		Iphone6.materials(28, "64", 77);

		// Phone is hierarchical inheritance class because all the classes like Iphone1

		// Iphon2 & Iphon6 is a multilevel inheritance class because it can inherit all
		// the methods and from Iphone 1 and

		// Iphone1 is a

		/*
		 * Comment out at the end of TestPhone to inform me which is hierarchical
		 * inheritance, multilevel inheritance, and single inheritance. [points: 50].
		 */

	}
}
