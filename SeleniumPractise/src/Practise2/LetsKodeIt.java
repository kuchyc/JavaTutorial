package Practise2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetsKodeIt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/rebeccachatikobo/Documents/WorkSpace_Personal/Selenium/geckodriver");
		driver = new FirefoxDriver();
		//String baseURL = "https://www.bing.com";
		String baseURL = "https://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(3000);
		//driver.findElement(By.className("title")).click();
		driver.findElement(By.className("navbar-link fedora-navbar-link")).click();
		
		//driver.findElement(By.id("sb_form_q")).sendKeys("letskodeit");
		Thread.sleep(3000); 
		//driver.findElement(By.name("go")).click();
		//driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		//Thread.sleep(3000);
		driver.quit();
	}
}




