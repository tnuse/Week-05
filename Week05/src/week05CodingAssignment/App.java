package week05CodingAssignment;


public class App {

	public static void main(String[] args) {
		
		// Instantiate AsteriskLogger class for Logger interface
		Logger astLogger = new AsteriskLogger();
		// Instantiate SpacedLogger class for Logger interface
		Logger spcLogger = new SpacedLogger();
		

		// Required Strings to be passed into the AsteriskLogger class 
		astLogger.log("Hello");
		astLogger.error("Abigail");
		
		// Required Strings to be passed into the SpacedLogger class 
		spcLogger.log("Source");
		spcLogger.error("Code");
		
		
		
		
		
		
	}

}
