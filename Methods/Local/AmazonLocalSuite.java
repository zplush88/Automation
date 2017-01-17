package Local;

import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import  Capabilities.AmazonTestTemplate; 

public class AmazonLocalSuite extends AmazonTestTemplate {

	@Before
    public void setUp() throws Exception {
        
        driver = new FirefoxDriver();
        testBrowser ="Firefox Local macOS Sierra";
    
	}
    @Test
    public void AmazonShopOnline() throws Exception {

    //Call Current Test
    	currentTest = amazonShopOnlineTest;
    	
    	if (!testBrowser.contains("local")){
    		callDriver(ATDesktopBreakpoint);
    	}
    	
    	//Insert Test Here
    	amazonshoponline.amazonShopOnline(driver, ATDesktopBreakpoint, AmazonTestTemplate.localWidth, 
    								AmazonTestTemplate.localHeight, testBrowser, currentTest);
   
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
