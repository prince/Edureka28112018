package day7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Project\\edureka24112018\\Edureka\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
		//Dimension de=new Dimension(768, 1024);
		//driver.manage().window().setSize(de);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://images.google.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='S3Wjs']")).click();
		driver.findElement(By.linkText("Upload an image")).click();
		driver.findElement(By.id("qbfile")).click();
		Runtime.getRuntime().exec("D:\\Project\\edureka24112018\\Edureka\\AutoItScript\\image.exe");

	}

}
