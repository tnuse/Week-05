package week05CodingAssignment;

public class AsteriskLogger implements Logger {

	
	//Values required for this class
	private String logString;
	private String errorString;
	
	
	// Override log Method from Logger interface for this class
	@Override
	public void log(String logString) {
		// Print required result for AsteriskLogger log message
		System.out.println("*** " + logString + " ***\n");
		
	}


	// Override error Method from Logger interface for this class
	@Override
	public void error(String errorString) {
		// StringBuilder to create Asterisk line below and above error
		StringBuilder sbAsterisk = new StringBuilder();
		// for Loop to generate Asterisk line based on the size of the error String.
		for (int i = 0; i < (errorString.length()+15) ; i++) {
			sbAsterisk.append("*");
		}
		
		// print required result for AsteriskLogger error message
		System.out.println(sbAsterisk.toString() + "\n*** Error: " + errorString + " ***\n" + sbAsterisk.toString());
	}

	
// Getters and Setters
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
