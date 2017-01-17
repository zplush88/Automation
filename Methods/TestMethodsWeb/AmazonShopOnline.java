package TestMethodsWeb;

import java.sql.Driver;

import javassist.expr.NewArray;

import org.apache.tools.ant.taskdefs.optional.clearcase.ClearCase;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import  Capabilities.AmazonSharedCapabilities; 


public class AmazonShopOnline extends AmazonSharedCapabilities{

	public void amazonShopOnline(WebDriver driver, String ATBreakpoint, int width,
            int height, String testBrowser, String currentTest) throws Exception {
        WebDriverWait PageLoad = new WebDriverWait(driver, PageTimeout);
  
    driver.get(baseUrl);
    
    //SIGNING INTO AMAZON 
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#nav-link-yourAccount > span.nav-line-2"))).click(); // Click on Hello.Sigin Your Account
     
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#ap_email"))).sendKeys("zahrasays@gmail.com"); //Click on Email field and enter email address
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#ap_password"))).sendKeys("pa55word"); //Click on Password field and enter Password
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#signInSubmit"))).click(); // Click on Sign in CTA
    
    //SEARCH FOR PRODUCT
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#twotabsearchtextbox"))).click(); // Click on Search field
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#twotabsearchtextbox"))).sendKeys("Amazon Echo"); // Enter Amazon Echo in search
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("div.nav-right > div > input"))).click(); // Search for Amazon Echo
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("div:nth-child(1) > a > h2")));
    assertTrue(driver.findElement(By.
    		cssSelector("div:nth-child(1) > a > h2")).getText().contains("Amazon Echo")); // Ensure the result contains my Query as search results will vary
    
    //Verifying price of product
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("div:nth-child(1) > a > h2"))).click(); // Select Amazon Echo Black
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#add-to-cart-button"))).click(); // Add Amazon Echo to basket
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("div.a-popover-header > button"))).click(); // Dismiss popup
    
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#nav-cart-count"))).click(); //Click on Basket CTA
       
    assertTrue(driver.getPageSource().contains("149.99"));
    
    System.out.println("Price Match");
        }
        
        
	}

