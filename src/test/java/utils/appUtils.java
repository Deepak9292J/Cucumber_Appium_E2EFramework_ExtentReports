package utils;

import java.io.File;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import resources.LogsFile;

public class appUtils extends AppiumServerStartStop {
	public static AndroidDriver driver ;
	public static Logger log = (Logger) LogManager.getLogger(LogsFile.class.getName());
	public static AndroidDriver capabilities()  throws Exception  {
		appiumStart();

		File f= new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		Cap.setCapability("fullReset", false);
		Cap.setCapability("noReset", true);
		log.info("Desired caps supplied");
		driver= new AndroidDriver(new URL(service_url),Cap);
		log.info("Server Started successfully");
		return driver;
		
	}

}
