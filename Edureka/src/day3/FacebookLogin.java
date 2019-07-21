package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
	WebDriver driver;
	public void invokeBrowser(String bType)
	{
		if(bType.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",  "D:\\Project\\edureka24112018\\Edureka\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(bType.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver",  "D:\\Project\\edureka24112018\\Edureka\\Drivers\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	public void signUP()
	{
		WebDriverWait wait=new WebDriverWait(driver,50);
		WebElement eled=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'First name')]/following-sibling::input")));
		eled.sendKeys("Prince");
		//driver.findElement(By.xpath("//div[contains(text(),'First name')]/following-sibling::input")).sendKeys("Prince");
		driver.findElement(By.xpath("//div[contains(text(),'Surname')]/following-sibling::input")).sendKeys("prakash");
	    driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input")).sendKeys("7795569608");
	    driver.findElement(By.xpath("//input[@type='password' and @name='reg_passwd__']")).sendKeys("77959608");
	    WebElement date= driver.findElement(By.xpath("//select[@title='Day']"));
	    Select dates=new Select(date);  
	    dates.selectByIndex(17);
	    //--------------------------------//
	    WebElement month= driver.findElement(By.xpath("//select[@title='Month']"));
	    Select months=new Select(month);  
	    months.selectByVisibleText("May");
	    //----------------------------------------//
	    WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
	    Select years=new Select(year);  
	    years.getFirstSelectedOption();
	    //---------------------------------------------//
	    driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
	    driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
	}
}
