
public class AsteriskLogger implements Logger {
	//3 Create two classes that implement the Logger interface
	//4. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String 
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + " " + log + " " + "***");
	}

	//5. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. 
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		StringBuilder asteriskLine = new StringBuilder("\n*");
		StringBuilder astriskError = new StringBuilder("Error: ");
		astriskError.append(error);
		
		for (int i = 0; i < astriskError.length() + 5; i++) {
			asteriskLine.append("*");
		}
		asteriskLine.append("\n");
		System.out.println(asteriskLine + "***" + astriskError + "***" + asteriskLine);
		
	}

}
