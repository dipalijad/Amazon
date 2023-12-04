package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//1.Search iPhone -> select from the list -> go to product details page -> select and store price in a variable -> add to cart

public class Amaze {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.firefox.driver", "F:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("iPhone");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(driver.getWindowHandles().toArray()[1]+"");
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	   // String price = driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-price-whole'][normalize-space()='52,999']")).getText();
	    
	    driver.findElement(By.xpath("(//input[@value='Add to Cart'])[2]")).click();  
	    
	    Thread.sleep(5000);
	    driver.quit();
	}

}
