package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reusable extends webelements {
	
	public WebDriver driver;
	
	public void Load(String url){
		driver.get(url);
	}
	
	public void click(By value){
		driver.findElement(value).click();
		
	}
	
	public void Entereditbxvalue(By element, String value){
		driver.findElement(element).sendKeys(value);
	}

	public void maximize(){
		driver.manage().window().maximize();
	}
	
	public void wait(int value) throws InterruptedException{
		Thread.sleep(value);
	}
	
	
	// Explicit Wait //

	public void Explicitwait(String xpath){
		WebDriverWait wait1= new WebDriverWait(driver, 20);
		  wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	// Mouse hover //
	public void mousehover(String value) throws InterruptedException{
		WebElement xpath= driver.findElement(By.xpath(value));
		Actions action =new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(xpath).build().perform();
		
	}
	
	//Click by xpath //
	public void clickbyxpath(String xpath){
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	// Get text //
	
	public void gettext(String xpath, String value){
		String text= driver.findElement(By.xpath(xpath)).getText();
		
		if(text.startsWith("(+)")){
			int count= text.length();
			String output= text.substring(count-11);
			System.out.println(value +"="+ output);
		}else{
			System.out.println(value +"="+ text);
		}
	}
	
	
	public void close(){
		driver.close();
	}
}
