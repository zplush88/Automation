package Local;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;

import Capabilities.ZopaTestTemplate;

public class ZopaLocalSuite extends ZopaTestTemplate  {

	@Before
    public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		testBrowser ="Firefox Local macOS Sierra";
    
	}
    @Test
    public void ZopaTest() throws Exception {

    //Call Current Test
    	currentTest = Zopatest;
    	
    	if (!testBrowser.contains("local")){
    		callDriver(ATDesktopBreakpoint);
    	}
    	
    	//Insert Test Here
    	zopatest.Zopatest(driver, ATDesktopBreakpoint, ZopaTestTemplate.localWidth, 
    								ZopaTestTemplate.localHeight, testBrowser, currentTest);
   
    }
    
	@After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
    }
	
	}
	
}
