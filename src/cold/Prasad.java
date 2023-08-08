package cold;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Prasad {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_2QfC02']//descendant::button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ca=driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		WebElement nm=driver.findElement(By.xpath("//div[text()='Appliances']"));
		//keyboard and mouse actions
		Actions bs=new Actions(driver);
		bs.moveToElement(ca);
		bs.perform();
		Thread.sleep(5000);
		bs.doubleClick(ca);
		bs.perform();
		Thread.sleep(5000);
		bs.contextClick(ca);
		bs.perform();
		Robot po=new Robot();
		po.keyPress(KeyEvent.VK_1);
		po.keyRelease(KeyEvent.VK_1);
	    bs.dragAndDrop(ca, nm);
		bs.perform();
}}
