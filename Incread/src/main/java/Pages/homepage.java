package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.Openbrowser;


public class homepage 
{	
	public WebDriver driver;
	
	By search=By.xpath("//input[@type='text']");
	By limiteddeal=By.xpath("//*[text()='Limited time deal']");

	public homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement searchtext()
	{
		return driver.findElement(search);
	}
	public WebElement limitdeal()
	{
		return driver.findElement(limiteddeal);
	}
	
}
