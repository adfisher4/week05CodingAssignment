package Week05CodingAssignment;

public class SpacedLogger implements Logger {
	
	String str;

	public SpacedLogger (String str) {
		this.str = str;
	}
	
	//Private method to space out the message
	private String addSpaces(String message) {
		StringBuilder spacedMess = new StringBuilder();
		char[] letters = message.toCharArray();
		for (char letter: letters) {
			spacedMess.append(letter);
			spacedMess.append(" ");
			
		}
		return spacedMess.toString();
	}
	
	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
		
	}
	
	@Override
	public void error(String message) {
		StringBuilder spacedErrMess = new StringBuilder();
		spacedErrMess.append("ERROR: ");
		spacedErrMess.append(addSpaces(message));
			
		
		System.err.println(spacedErrMess.toString());
	}
	

}
