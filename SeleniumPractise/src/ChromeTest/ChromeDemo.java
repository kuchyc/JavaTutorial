package ChromeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException {
		// http://chromedriver.storage.googleapis.com/index.html
		WebDriver driver;
		String baseURL = "https://demostore.x-cart.com/";
		System.setProperty("webdriver.chrome.driver", "/Users/rebeccachatikobo/Documents/WorkSpace_Personal/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseURL);
		Thread.sleep(4000);
		//driver.findElement(By.xpath(null))

	}

}
