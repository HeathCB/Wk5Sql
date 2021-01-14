
public class SpacedLogger implements Logger{
	//3 Create two classes that implement the Logger interface
	//6. The SpacedLogger should add spaces between each character of the String argument passed into its methods
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println(log.replace("", " "));
	}
	//8. The SpacedLogger should add spaces between each character of the String argument passed into its methods
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder errorSpaced = new StringBuilder("Error: ");
		errorSpaced.append(error.replace("", " "));
		System.out.println(errorSpaced);
	}
	

}
