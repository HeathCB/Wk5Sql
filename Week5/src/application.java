
public class application {
	//9. Create a class named App that has a main method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//10. In this class instantinate an instance of each of your logger classes that implement the Logger interface
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
	
	//11. Test both methods on both instances, passing in Strings of your choice.
		asteriskLogger.log("Hoooplah");
		asteriskLogger.error("Oh jeeez an error");
		
		
		spacedLogger.log("Hooplah");
		spacedLogger.error("Not another Error");
		
	}
}
