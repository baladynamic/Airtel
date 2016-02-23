package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import ObjectRepository.Reusable;

public class Mainclass extends Reusable {
	
	
	 @Parameters("browser")
	 @BeforeMethod
	  public void beforeMethod(String browser) {
		 
		 if(browser.equalsIgnoreCase("firefox")){
			 driver= new FirefoxDriver();
		 }else if(browser.equalsIgnoreCase("chrome")){
		 
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
	 }
		 Load(url);
		 maximize();
		 
	  }

	 
  @Test
  public void TC1() throws InterruptedException {
	  
	 // click(popupclose);
	     click(perlogin);
	     wait(2000);
		 click(continuelogin);
		 wait(1000);
		 Entereditbxvalue(loginid, userid);
		 Entereditbxvalue(passwd, password);
		 click(loginbtn);
		 wait(2000);
		 Explicitwait(logout);
		 clickbyxpath("//input[contains(@id,'GET_STATEMENT')]");
		 wait(1000);
		 
		 clickbyxpath("//span[text()='Get Statement']");
		 wait(2000);
		 
		 
		 
		 
		 
		 
		 mousehover(menu);
		 clickbyxpath(Deposits);
		 wait(2000);
		 
		 gettext(Accno, "Account number");
		 gettext(Accname, "Account holder name");
		 gettext(Fxtdpt, "Fixed deposit amount");
		 gettext(maturity, "Maturity amount");
		 gettext(maturitydate, "Maturity date");
		 
		
		 
  }
 
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  wait(2000);
	  click(logoutlnk);
	  wait(1000);
	  close();
  }

}
