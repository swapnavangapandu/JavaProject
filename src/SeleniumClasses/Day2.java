package SeleniumClasses;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://flipkart.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().minimize();
		driver.quit(); */
		String url = "https://mail.google.com/";
		driver.get(url);
		String curl = driver.getCurrentUrl();
		if(url.equals(curl)) {
			System.out.println("TestPass");
		}
		else {
			System.out.println("TestFail");
			System.out.println("Expected url" + url + "but actual url is" + curl);
		}
	}

}
