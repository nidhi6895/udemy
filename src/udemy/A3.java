package udemy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\OneDrive\\Desktop\\Selenium\\Selenium-learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		WebElement dr = driver.findElement(By.id("autocomplete"));
		
		String txt="India";
		int x=driver.findElements(By.xpath(".//*[@id='ui-id-1']/li")).size();
	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);


	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	  //Use for SS
	   // File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   //FileUtils.copyFile(src,new File("C://screenshot.png"));
	   

	}	}

