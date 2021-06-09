package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\OneDrive\\Desktop\\Selenium\\Selenium-learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rowCount=driver.findElements(By.xpath(".//*[@name='courses']/tbody/tr")).size();
		System.out.println("Number of rows in table are "+ rowCount);
		int columnCount=driver.findElements(By.xpath(".//*[@name='courses']/tbody/tr/th")).size();
		System.out.println("Number of coulumn in table are "+ columnCount);
		List<WebElement> a=driver.findElements(By.xpath(".//*[@name='courses']/tbody/tr[3]"));
		int s=a.size();
		for(int i=0;i<s;i++) {
			String txt=a.get(i).getText();
			System.out.println(txt);
			driver.quit();

		}

	
	}

}
