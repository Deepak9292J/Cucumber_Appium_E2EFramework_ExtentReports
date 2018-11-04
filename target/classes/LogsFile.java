package resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LogsFile {

	public static Logger log = (Logger) LogManager.getLogger(LogsFile.class.getName());

	public static void startTestCase(String sTestCaseName){
		log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	
	public static void endTestCase(String sTestCaseName){
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		}
}
