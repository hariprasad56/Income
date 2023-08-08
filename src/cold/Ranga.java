package cold;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;


public class Ranga {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']//descendant::button")).click();
//		WebElement ds=driver.findElement(By.xpath("//select[@id='ide']"));
//		ds.click();
//		Select sc=new Select(ds);
//		sc.selectByVisibleText("Eclipse");
//		Thread.sleep(5000);
//		sc.deselectByVisibleText("Eclipse");
//		
		WebElement ut=driver.findElement(By.className("_3OO5Xc"));
		Point as=ut.getLocation();
		Thread.sleep(3000);
		WebElement xz=driver.findElement(By.xpath("//div[text()='mobiles']"));
		xz.click();
		//scroll down on webpage
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy"+as);
		js.executeScript("window.scrollBy(0,1000)");
		//handle disabled elements on web page
		//we use java script
		//js.executeScript(document.element address.value="")
		
	}

}
