package Testcase;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseClass.Openbrowser;
import Pages.cart;
import Pages.homepage;

public class Addtocart extends Openbrowser {
@Test
public void openamazon() throws IOException
	{
		driver=openbrowsers();
		driver.get(prop.getProperty("URL"));
		homepage mob= new homepage(driver);
		mob.searchtext().sendKeys("phone");
		cart adcart=new cart(driver);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		List<WebElement> count=driver.findElements(By.xpath("//*[text()='Limited time deal']"));
			for(int i=0;i<=count.size();i++)
		{
				driver.findElement(By.xpath("//*[Limited time deal']")).click();
		}
			adcart.addcart().click();
	}
@AfterTest
public void closebrowser()
{
	driver.close();
}
}

