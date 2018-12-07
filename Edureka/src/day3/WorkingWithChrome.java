package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	WebDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Project\\edureka24112018\\Edureka\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
		Dimension de=new Dimension(768, 1024);
		driver.manage().window().setSize(de);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
