package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//3. Search phone -> apply filters -> validate the filtered list

public class Amaze1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.firefox.driver", "F:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Phone");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Samsung')]")).click();
		 
		 String brand=driver.findElement(By.xpath("(//span[contains(text(),'Samsung')])[1]")).getText();
		 Assert.assertEquals(brand,"Samsung Galaxy M04 Dark Blue");
		 
		 
		 String brand1=driver.findElement(By.xpath("(//span[contains(text(),'Samsung')])[2]")).getText();
		 Assert.assertEquals(brand1,"Samsung Galaxy M13");
		 
		 Thread.sleep(5000);
		 driver.quit();	 
	}

}
