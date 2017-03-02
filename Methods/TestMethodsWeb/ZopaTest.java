package TestMethodsWeb;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  Capabilities.ZopaSharedCapabilities; 

public class ZopaTest extends ZopaSharedCapabilities {
	
	public void Zopatest(WebDriver driver, String ATBreakpoint, int width,
            int height, String testBrowser, String currentTest) throws Exception {
        WebDriverWait PageLoad = new WebDriverWait(driver, PageTimeout);
  
    driver.get(baseUrl);
    
    //SELECT INVEST WITH ZOPA
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#homepage-hero > div > div > div > div.twoBlock__blockTwo > a"))).click();
    
    //SELECT VIEW PRODUCT RATES	
    PageLoad.until(ExpectedConditions.elementToBeClickable(By.
    		cssSelector("#content > section.hero > div > div > a"))).click();

    //TICK RISK CHECKBOX
    WebElement element = driver.findElement(By.id("understand_risks_checkbox"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click()", element);
    
    //CLICK SUBMIT
    WebElement element1 = driver.findElement(By.xpath("//section[1]/div/div[2]/form/div[2]/input"));
    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    executor1.executeScript("arguments[0].click()", element1);
    
  //ENTER PERSONAL DETAILS FORM COMPLETION
    
    //ACCOUNT SETUP
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		cssSelector("#member_email"))).sendKeys("test@test.com");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_password"))).sendKeys("test");
     
     //SECURITY QUESTIONS
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_first_school"))).sendKeys("Harrow High School");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_last_school"))).sendKeys("Pinner School");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_town_of_birth"))).sendKeys("Harrow");
     
     //PERSONAL DETAILS
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_lenders_lender_application_first_name"))).sendKeys("John");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_lenders_lender_application_last_name"))).sendKeys("Doe");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_lenders_lender_application_home_phone"))).sendKeys("07742790867");
     //DOB
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("date_of_birth_day"))).sendKeys("01");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("date_of_birth_month"))).sendKeys("02");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("date_of_birth_year"))).sendKeys("1988");
     
     //ADDRESS
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("house_number"))).sendKeys("1");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("postcode"))).sendKeys("HA3 9QR");
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("find_address"))).click();
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("possible_addresses_43080054184"))).click();
     
     PageLoad.until(ExpectedConditions.elementToBeClickable(By.
     		id("member_lenders_lender_application_addresses_0_from_2i"))).click();
     
     //MOVE IN DATE
     Select dropdown1 = new Select(driver.findElement(By.
     		id("member_lenders_lender_application_addresses_0_from_2i")));
     dropdown1.selectByVisibleText("January");
     
     Select dropdown2 = new Select(driver.findElement(By.
     		id("member_lenders_lender_application_addresses_0_from_1i")));
     dropdown2.selectByVisibleText("2004");
     
     //AGREE to Zopa Principles     
     WebElement element2 = driver.findElement(By.id("member_accept_principles"));
     JavascriptExecutor executor2 = (JavascriptExecutor)driver;
     executor2.executeScript("arguments[0].click()", element2);
    
}
	
}