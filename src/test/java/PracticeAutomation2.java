import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomation2 {
	
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver( ).setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/label")).click();
			
			Thread.sleep(4000);
			
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[4]/label")).click();
			
			Thread.sleep(4000);
			
			 driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[5]/label")).click();
				
				Thread.sleep(4000);
				
			
			driver.close();
		}
		
}

			
		


