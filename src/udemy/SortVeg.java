package udemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortVeg {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\OneDrive\\Desktop\\Selenium\\Selenium-learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//1. click on sort button
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> ls= driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//collect data of webelement list into string list 
		List<String> orignalList= ls.stream().map(s->s.getText()).collect(Collectors.toList());
		//Sort that list
		List<String> sortList= orignalList.stream().sorted().collect(Collectors.toList());
		//compare both list
		 Assert.assertTrue(sortList.equals(orignalList));
		 
		 //get beans
		 List<Object> price=ls.stream().filter(s->s.getText().contains("Beans")).
				 map(s->getpriceveg(s)).collect(Collectors.toList());
		 
		 price.forEach(a->System.out.println(a));
		 
			 
		 }

	private static Object getpriceveg(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
		
	}
	}


