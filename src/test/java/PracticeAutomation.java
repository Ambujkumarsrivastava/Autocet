import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomation {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver( ).setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("name"));

		ele.sendKeys("Ambuj");
		
		Thread.sleep(2000);
		
		
		WebElement ele1 = driver.findElement(By.id("phone"));

		ele1.sendKeys("9648765432");
		
		Thread.sleep(2000);
		
		
		WebElement ele2 = driver.findElement(By.id("email"));

		ele2.sendKeys("ambuj123@gmailo.com");
		
		Thread.sleep(2000);
		
		
		WebElement ele3 = driver.findElement(By.id("password"));

		ele3.sendKeys("KA@123");
		
		Thread.sleep(2000);
		
		
		WebElement ele4 = driver.findElement(By.id("address"));

		ele4.sendKeys("Delhi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		driver.close();


	}

}
