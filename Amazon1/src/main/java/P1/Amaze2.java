package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//2.Register user

public class Amaze2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.firefox.driver", "F:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")).click();
		Thread.sleep(3000);
		    
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.id("ap_customer_name"));
	    searchBox.clear();
	    searchBox.sendKeys("Dipali Jadhav");
	    Thread.sleep(2000);
	    
	    WebElement searchBox1 = driver.findElement(By.id("ap_phone_number"));
	    searchBox1.clear();
	    searchBox1.sendKeys("9763546433");
	    Thread.sleep(2000);
	    
	    WebElement searchBox2 = driver.findElement(By.id("ap_email"));
	    searchBox2.clear();
	    searchBox2.sendKeys("dipalijadhav82@gmail.com");
	    Thread.sleep(2000);
	    
	    WebElement searchBox3 = driver.findElement(By.id("ap_password"));
	    searchBox3.clear();
	    searchBox3.sendKeys("123456");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(5000);
	  
		driver.quit();
	}

}

