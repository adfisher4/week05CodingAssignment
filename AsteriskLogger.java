package Week05CodingAssignment;

public class AsteriskLogger implements Logger {
	
	String str;

	public AsteriskLogger (String str) {
		this.str = str;
	}
	
	@Override
	public void log(String message) {
		StringBuilder messInAst = new StringBuilder();
		messInAst.append("***");
		messInAst.append(message);
		messInAst.append("***");
		
		System.out.println(messInAst.toString());
	}
	
	@Override
	public void error(String errMessage) {
		StringBuilder messInAst = new StringBuilder();
		messInAst.append("*".repeat(errMessage.length() + 13));
		messInAst.append("\n");
		messInAst.append("***Error: ");
		messInAst.append(errMessage);
		messInAst.append("***");
		messInAst.append("\n");
		messInAst.append("*".repeat(errMessage.length() + 13));
		
		System.err.println(messInAst.toString());
	}


}
