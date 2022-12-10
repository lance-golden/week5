
public class App {

	public static void main(String[] args) {
		
	AsteriskLogger test1 = new AsteriskLogger();
	SpacedLogger test2 = new SpacedLogger();
	
	test1.error("number 1");
	System.out.println();
	test2.log("number 2");
	System.out.println();
	test1.error("number 3");
	System.out.println();
	test2.log("number4");
	}
}

