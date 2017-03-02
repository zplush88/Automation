package Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import TestMethodsWeb.ZopaTest;

public class ZopaTestTemplate {
	
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
		public String Zopatest = "Invest with Zopa";
		
		//IMPORT TEST CLASSES
		public ZopaTest zopatest = new ZopaTest();
		

		public void callDriver(String ATBreakpoint) throws Exception {
	        DesiredCapabilities capability = new DesiredCapabilities();

}
}
