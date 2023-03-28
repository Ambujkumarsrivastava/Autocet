package uploadandpopup;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}
	@Test
	public void Select() throws InterruptedException {
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/select"));
		ele.sendKeys("Norway");
		
		Thread.sleep(2000);
		driver.close();
	}

}
