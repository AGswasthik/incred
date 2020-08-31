package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart 
{
public WebDriver driver;
	
	By addtocarts=By.cssSelector("#add-to-cart-button");
	

	public cart(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement addcart()
	{
		return driver.findElement(addtocarts);
	}
	

}
