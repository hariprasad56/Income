package cold;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Jeswitha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
	//	FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.close();
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.close();
		//driver.findElement(By.tagName("button"));
		//driver.findElement(By.className("fk-modal-visible"));
		//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("8019114220");
//		driver.findElement(By.id("pass")).sendKeys("8019114220");
//		Thread.sleep(3000);
//		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8019114220");
		//driver.findElement(By.xpath("//label[@class='_1fqY3P']//dece")).sendKeys("8019114220");
		//driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//descendant::input")).sendKeys("8019114220");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		//driver.findElement(By.xpath("//input[@maxlength='1']"));
		//driver.close();
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='_2QfC02']//descendant::button")));
		driver.findElement(By.xpath("//div[@class='_2QfC02']//descendant::button")).click();
		//Thread.sleep(5000);
		//WebDriverWait wait= new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='_2QfC02']//descendant::button")));
		//driver.findElement(By.xpath("//img[@loading='lazy']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@title='Enter pincode']")).sendKeys("534406");
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.findElement(By.xpath("//div[@class='_HYyiu']//child::img")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@type='checkbox']//following::div")).click();
		Thread.sleep(5000);
		//driver.close();
		//contains
		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB')]")).click();
		//Thread.sleep(9000);
		//driver.findElement(By.xpath("//button[starts-with(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='1AtVbE col-12-12']//following-sibling::li[1]")).click();
		//driver.findElement(By.xpath("//li[@class='col col-6-12']"));
		//driver.quit();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']//parent::li")).click();
		
		
		

		
	}

}
