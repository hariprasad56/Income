package cold;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	public POM(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
		@FindBy(className= "_2YxCDZ")WebElement hs;
		public void click()
		{
			hs.click();
		}
	}


