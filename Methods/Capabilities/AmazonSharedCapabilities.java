package Capabilities;

import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.WebDriver;

public class AmazonSharedCapabilities {
	
	//SET PROJECT
	public static String project = "Immerse";

	//WAIT
	public static int PageTimeout = 20;
	
	//URLS
	public String baseUrl = AmazonCapabilityMethods.baseUrl;
	
	//Local Width and height
	public static int localWidth = 1200;
    public static int localHeight = 700;
	
}
