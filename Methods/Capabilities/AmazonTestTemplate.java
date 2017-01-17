package Capabilities;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import TestMethodsWeb.AmazonShopOnline;


public class AmazonTestTemplate {
	
	//SETTING UP DRIVER
	public WebDriver driver;
	public String testBrowser;
	public StringBuffer verificationErrors = new StringBuffer();
	
	//BREAKPOINTS
	public int desktopWidth = 1300;
	public int desktopHeight = 1000;
	
	// LOCAL WIDTH AND HEIGHT
    public static int localWidth = 1200;
    public static int localHeight = 700;
	
	public String ATDesktopBreakpoint = "Desktop";
	
	//TESTS
	public String currentTest;
	public String amazonShopOnlineTest = "Test shop online at amazon";
	
	//IMPORT TEST CLASSES
	public AmazonShopOnline amazonshoponline = new AmazonShopOnline();
	

	public void callDriver(String ATBreakpoint) throws Exception {
        DesiredCapabilities capability = new DesiredCapabilities();
        
}
}
