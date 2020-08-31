package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser
{
	public FileInputStream fis;
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver openbrowsers() throws IOException
	{
		prop =new Properties();
		fis=new FileInputStream("C:\\Users\\swast\\OneDrive\\Desktop\\incread\\Incread\\src\\main\\resources\\Property.properties");
		prop.load(fis);
		String Browsername=prop.getProperty("browser");
		if(Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\swast\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browsername.equals("Firefox"))
		{
			
		}
		else
		{
			System.out.println("No browser found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	

}
