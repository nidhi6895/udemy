package udemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\OneDrive\\Desktop\\Selenium\\Selenium-learning\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String option=driver.findElement(By.xpath("//body/div/div[4]/fieldset/label[2]")).getText();
	System.out.println(option);
	driver.findElement(By.xpath("//body/div/div[4]/fieldset/label[2]/input")).click();

	WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
	Select s=new Select(dropdown);
	s.selectByVisibleText(option);
	driver.findElement(By.id("name")).sendKeys(option);
	driver.findElement(By.id("alertbtn")).click();
	String a=driver.switchTo().alert().getText();	
	if(a.contains(option)) {
		System.out.println("Alert message success");
		
	} else {
		System.out.println("Something wrong with execution");
	}
	
}}
