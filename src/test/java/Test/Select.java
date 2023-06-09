package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {
	
	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}

	@Test
	public void Select() throws InterruptedException {
		
	    //WebElement dropdown = driver.findElement(By.className("custom-select"));
	    //Select select = new Select(dropdown);
	    //select.selectByVisibleText("Norway");
		
		WebElement web = driver.findElement(By.className("custom-select"));

		valueselect(web, "Norway");
		
		Thread.sleep(2000);
		
		WebElement web1 = driver.findElement(By.className("custom-select"));

		valueselect(web1, "Spain");
		
		Thread.sleep(2000);
		
		WebElement web2 = driver.findElement(By.className("custom-select"));

		valueselect(web, "Sweden");

		
	}
		private static void valueselect(WebElement el, String val) {
			Select drp=new Select();
			List<WebElement>everyvalue=drp.getOptions();
			for(WebElement value:everyvalue) {
				if(value.getText().equals(val)) {//value//
					value.click();
					break;
				}
			}
	    
		}

	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}


}
