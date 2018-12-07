package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gure99Project {
	WebDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Project\\edureka24112018\\Edureka\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
		//Dimension de=new Dimension(768, 1024);
		//driver.manage().window().setSize(de);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
		System.out.println(driver.getTitle());
		
	}
 public void login(String id ,String Password)
 {
	driver.findElement(By.name("uid")).sendKeys(id);
    driver.findElement(By.name("password")).sendKeys(Password);
    driver.findElement(By.name("btnLogin")).click();
    driver.findElement(By.linkText("New Customer")).click();
    driver.findElement(By.name("name")).sendKeys("prince");
    driver.findElement(By.xpath("//input[@value='m']")).click();
    driver.findElement(By.name("dob")).sendKeys("17/05/1993");
    driver.findElement(By.name("addr")).sendKeys("Kolkata");
    driver.findElement(By.name("city")).sendKeys("Kolkata");
    driver.findElement(By.name("state")).sendKeys("west bengal");
    driver.findElement(By.name("pinno")).sendKeys("752201");
    driver.findElement(By.name("telephoneno")).sendKeys("7795569608");
    String emailId="a"+System.currentTimeMillis()+"@gmail.com";
    driver.findElement(By.name("emailid")).sendKeys(emailId);
    driver.findElement(By.name("password")).sendKeys("ererer");
    driver.findElement(By.name("sub")).click();
	
	
 }
 public void closeDriver()
 {
	 driver.close(); 
 }
 public String customerID()
 {
	 return driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText();
 }
 
}
