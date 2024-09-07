package Week05CodingAssignment;

public class SpacedLogger implements Logger {
	
	String str;

	public SpacedLogger (String str) {
		this.str = str;
	}
	
	@Override
	public void log(String message) {
		StringBuilder spacedMess = new StringBuilder();
		char[] letters = message.toCharArray();
		for (char letter: letters) {
			spacedMess.append(letter);
			spacedMess.append(" ");
			
		}
		
		System.out.println(spacedMess.toString());
		
	}
	
	@Override
	public void error(String message) {
		StringBuilder spacedErrMess = new StringBuilder();
		StringBuilder spacedMess = new StringBuilder();
		spacedErrMess.append("ERROR: ");
		
		
		char[] letters = message.toCharArray();
		for (char letter: letters) {
			spacedMess.append(letter);
			spacedMess.append(" ");
		}
		spacedErrMess.append(spacedMess.toString());
			
		
		System.err.println(spacedErrMess.toString());
	}
	

}
