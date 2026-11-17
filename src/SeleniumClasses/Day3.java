package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
/*	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("FirstName")).sendKeys("swapna");
	driver.findElement(By.id("LastName")).sendKeys("abs");
	driver.findElement(By.name("Email")).sendKeys("test@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("test@123");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("test@123");
	driver.findElement(By.id("register-button")).click();*/
	driver.close();
	}
}
