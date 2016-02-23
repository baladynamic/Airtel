     package ObjectRepository;

import org.openqa.selenium.By;

public class webelements {
	
	protected String url= "http://www.axisbank.com";
	protected String userid="857209126";
	protected String password= "krishnan162014#";
	
	protected By popupclose= By.className("mobileBannerClose");
	protected By perlogin = By.xpath("//div[@class='internetBanking']/div/following-sibling::img");
	protected By continuelogin= By.id("ContentPlaceHolder1_btnLogin");
	protected By loginid= By.id("loginId");
	protected By passwd= By.id("newPassword");
	protected By loginbtn= By.name("ABCustomLoginPortletFormSubmit");
	protected By logoutlnk= By.id("logoutlink");
	protected String menu= "//div[@id='menu-btn']";
	protected String Deposits="//a[text()='Deposits']";
	protected String Accno="//tr[th[span[text()='Account No.']]]/following-sibling::tr[2]/td[2]";
	protected String Accname="//tr[th[span[text()='Account No.']]]/following-sibling::tr[2]/td[3]";
	protected String Fxtdpt="//tr[th[span[text()='Account No.']]]/following-sibling::tr[2]/td[6]";
	protected String maturity="//tr[th[span[text()='Account No.']]]/following-sibling::tr[2]/td[7]";
	protected String maturitydate="//tr[th[span[text()='Account No.']]]/following-sibling::tr[2]/td[8]";
	
	
	
	protected String logout= "//a[@id='logoutlink']";

}
