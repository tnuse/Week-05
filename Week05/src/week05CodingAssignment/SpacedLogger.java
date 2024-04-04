package week05CodingAssignment;

public class SpacedLogger implements Logger {

	// Values required for this Class
	private String logString;
	private String errorString;	
	
	
	// Override log Method from Logger interface for this class
	@Override
	public void log(String log) {
		 //StringBuilder to create new String for SpacedLogger log result
		 StringBuilder sbLog = new StringBuilder();
		 // for Loop to create StringBuilder for new String, with spaces between each letter
		for (int i = 0; i < log.length(); i++) {
			sbLog.append(log.charAt(i) + " ");
			}
		// print required result for SpacedLogger log message
		System.out.println("\n"+sbLog.toString());
	}

	// Override error Method from Logger interface for this class
	@Override
	public void error(String error) {
		// StringBuilder to create new String for SpacedLogger error result
		 StringBuilder sbError = new StringBuilder();
		// for Loop to create StringBuilder for new String, with spaces between each letter
		for (int i = 0; i < error.length(); i++) {
			sbError.append(error.charAt(i) + " ");
			
		}
		
		// print required result for SpacedLogger error message
		System.out.println("\nError: " + sbError.toString());	
		
		
		
	}

	
	//  Getters and Setters
	public String getLogString() {
		return logString;
	}

	public void setLogString(String logString) {
		this.logString = logString;
	}

	public String getErrorString() {
		return errorString;
	}

	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}


}