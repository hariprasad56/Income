package cold;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hima {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']//descendant::button")).click();
		//Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		//Thread.sleep(3000);
//		WebDriverWait wait= new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='_1YAKP4']//child::select")));
		//WebElement dd=driver.findElement(By.xpath("//div[@class='_1YAKP4']//child::select"));
		//Thread.sleep(7000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement cd=driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
		//cd.click();
//		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(3000);
		//Select sc=new Select(cd);
	//	sc.selectByIndex(2);
		//sc.getFirstSelectedOption();
		//sc.selectByValue("10000");
		//sc.deselectByValue("10000");
//		Thread.sleep(3000);
//		WebElement fs=sc.getFirstSelectedOption();
//		System.out.println(fs);
		//cd.click();
//		List<WebElement> all=sc.getOptions();
//		for(int i=0;i<all.size();i++)
//		{
//			System.out.println(all.get(i).getText());
//		}
//		sc.selectByVisibleText("Min");
//		if(sc.isMultiple())
//		{
//			System.out.println("It is a multi select dropdown ");
//		}
//		else
//		{
//			System.out.println("It is a single select dropdown ");
//		}
//		cd.click();
//		try
//		{
//			
//			cd.click();
//		}
//		catch(StaleElementReferenceException e)
//		{
//			WebElement rf=driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
//			rf.click();
		//}
		POM ls=new POM(driver);
		ls.click();
		
	}
	
	}
	


