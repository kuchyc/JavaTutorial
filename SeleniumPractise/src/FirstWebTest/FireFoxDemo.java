package FirstWebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/rebeccachatikobo/Documents/WorkSpace_Personal/Selenium/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.bing.com";
		//String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(4000);
		driver.findElement(By.id("sb_form_q")).sendKeys("letskodeit");
		Thread.sleep(4000);
		driver.findElement(By.name("go")).click();
		//driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		Thread.sleep(4000);
		driver.quit();
	
	}
}




