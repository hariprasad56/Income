package cold;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollDownOnWebpage {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ut=driver.findElement(By.className("_3OO5Xc"));
		Point as=ut.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		//scroll down on particular element
		js.executeScript("window.scrollBy"+as);
		//scroll up and down
		js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("window.scrollBy(0,-1000)","");
	}}

