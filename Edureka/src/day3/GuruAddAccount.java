package day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class GuruAddAccount {
	WebDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\edureka24112018\\Edureka\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		
	}
	public void login (String Id ,String Password )
	{
		driver.findElement(By.name("uid")).sendKeys(Id);
		driver.findElement(By.name("password")).sendKeys(Password);
	    driver.findElement(By.name("btnLogin")).click();
		
	}
	public void addAccount()
	{

		driver.findElement(By.linkText("New Account")).click();

	
		driver.findElement(By.xpath("//input[@type='text' and @name='cusid']")).sendKeys("6666");
		WebElement element=driver.findElement(By.xpath("//select[@name='selaccount']"));
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText("Current");
		driver.findElement(By.xpath("//input[@type='text' and @name='inideposit']")).sendKeys("7777");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
