package FlipkartFil;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartFilter {
	public WebDriver driver;
	@Given ("^Launch browser \"(.*)\" and .exe file \"(.*)\"  path$")
	public void browser(String Browser,String Path)
	{
		System.setProperty(Browser, Path);
		driver=new ChromeDriver();
	}
	@Given ("^User enter \"(.*)\" as url$")
	public void Url(String Url)
	{
		driver.get(Url);
	}
	@Given ("^User maximize Screen$")
	public void MaxScreen()
	{
		driver.manage().window().maximize();
	}
	@Given ("^User close login page$")
	public void Loginclose() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000L);
	}
	@Given ("^User enter \"(.*)\" as text in search box and click on search$")
	public void mobileSearch(String mobile) throws InterruptedException
	{
		driver.findElement(By.className("_3704LK")).sendKeys(mobile);
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(3000L);
	}
	@When ("^user select (.+) as minimum price$")
	public void MinimumSelect(String Minimum) throws InterruptedException
	{
		try {
		Select Min=new Select(driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]")));
		Min.selectByValue(Minimum);
		Thread.sleep(3000L);
		}
		catch (Exception e)
		{
			
		}
	}
	@When ("^user select (.+) as maximum price$")
	public void MaxSelect(String Maximum)
	{
		try {
		Select Max=new Select(driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]")));
		Max.selectByValue(Maximum);
		}
		catch(Exception e)
		{
			
		}
	}
	@Then ("^user get respective price band in filters$")
	public void priceband() throws InterruptedException
	{
		try {
			Thread.sleep(3000L);
		String actual=driver.findElement(By.xpath("//div[@class='_3sckoD']")).getText();
		System.out.println(actual);
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			driver.close();
		}
	}
	@When ("^User click on 6GB and above$")
	public void SixGBAbove() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
		Thread.sleep(2000L);
	}
	@Then ("^User able to select 6GB and above checkbox$")
	public void selectedsixGB()
	{
		boolean a=driver.findElement(By.xpath("//div[text()='6 GB & Above']")).isSelected();
		if(a=true)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
	@When ("^User click on 4GB$")
	public void fourGB() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='4 GB']")).click();
		Thread.sleep(2000L);
	}
	@Then ("^User able to select 4GB checkbox$")
	public void selectedfourGB()
	{
		boolean a=driver.findElement(By.xpath("//div[text()='4 GB']")).isSelected();
		if(a=true)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
	@When ("^User click on 3GB$")
	public void ThreeGB() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='3 GB']")).click();
		Thread.sleep(2000L);
	}
	@Then ("^user able to select 3GB checkbox$")
	public void selectedThreeGB()
	{
		boolean a=driver.findElement(By.xpath("//div[text()='3 GB']")).isSelected();
		if(a=true)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
		@When ("^User click on 2GB$")
		public void twoGB() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[text()='2 GB']")).click();
			Thread.sleep(2000L);
		}
		@Then ("^User able to select 2GB checkbox$")
		public void selectedTwoGB()
		{
			boolean a=driver.findElement(By.xpath("//div[text()='2 GB']")).isSelected();
			if(a=true)
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test Fail");
			}
	}
		@When ("^User click on 1GB$")
		public void oneGB() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[text()='1 GB']")).click();
			Thread.sleep(2000L);
		}
		@Then ("^User able to select 1GB checkbox$")
		public void selectedoneGB()
		{
			boolean a=driver.findElement(By.xpath("//div[text()='1 GB']")).isSelected();
			if(a=true)
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test Fail");
			}
		}
			@When ("^User click on 512MB-1GB$")
			public void fiveonetwoToone() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='512 MB - 1 GB']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 512MB-1GB checkbox$")
			public void selectedfiveonetwoTooneGB()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='512 MB - 1 GB']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
	}
			@When ("^User click on Less Than 512MB$")
			public void lessfiveonetwo() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='Less than 512 MB']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select Less Than 512MB checkbox$")
			public void selected_lessfiveonetwo()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='Less than 512 MB']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
	}
			@Then ("^close window$")
			public void closewind()
			{
				driver.close();
			}
			@When ("^user click on realme brand checkbox$")
			public void Brand_realme()
			{
				driver.findElement(By.xpath("//div[text()='realme']")).click();
			}
			@Then ("^User able to select realme brand checkbox$")
			public void Brand_Check_realme()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='realme']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^user click on POCO brand checkbox$")
			public void Brand_POCO()
			{
				driver.findElement(By.xpath("//div[text()='POCO']")).click();
			}
			@Then ("^User able to select POCO brand checkbox$")
			public void Brand_Check_POCO()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='POCO']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^user click on Infinix brand checkbox$")
			public void Brand_Infinix()
			{
				driver.findElement(By.xpath("//div[text()='Infinix']")).click();
			}
			@Then ("^User able to select Infinix brand checkbox$")
			public void Brand_Check_Infinix()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='Infinix']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^user click on SAMSUNG brand checkbox$")
			public void Brand_SAMSUNG()
			{
				driver.findElement(By.xpath("//div[text()='SAMSUNG']")).click();
			}
			@Then ("^User able to select SAMSUNG brand checkbox$")
			public void Brand_Check_SAMSUNG()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='SAMSUNG']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^user click on Mi brand checkbox$")
			public void Brand_Mi()
			{
				driver.findElement(By.xpath("//div[text()='Mi']")).click();
			}
			@Then ("^User able to select Mi brand checkbox$")
			public void Brand_Check_Mi()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='Mi']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^user click on APPLE brand checkbox$")
			public void Brand_APPLE()
			{
				driver.findElement(By.xpath("//div[text()='APPLE']")).click();
			}
			@Then ("^User able to select APPLE brand checkbox$")
			public void Brand_Check_APPLE()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='APPLE']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^User click on 4 Star and above Rating$")
			public void Rating_fourStar() throws InterruptedException
			{
				driver.findElement(By.xpath("(//div[@class='_3879cV'])[15]")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 4 Star and above Rating checkbox$")
			public void Check_Rating_fourStar()
			{
				boolean a=driver.findElement(By.xpath("(//div[@class='_3879cV'])[15]")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^User click on 3 Star and above Rating$")
			public void Rating_threeStar() throws InterruptedException
			{
				driver.findElement(By.xpath("(//div[@class='_3879cV'])[16]")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 3 Star and above Rating checkbox$")
			public void Check_Rating_threeStar()
			{
				boolean a=driver.findElement(By.xpath("(//div[@class='_3879cV'])[16]")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^User click on 2 Star and above Rating$")
			public void Rating_twoStar() throws InterruptedException
			{
				driver.findElement(By.xpath("(//div[@class='_3879cV'])[17]")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 2 Star and above Rating checkbox$")
			public void Check_Rating_twoStar()
			{
				boolean a=driver.findElement(By.xpath("(//div[@class='_3879cV'])[17]")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@When ("^User click on 1 Star and above Rating$")
			public void Rating_oneStar() throws InterruptedException
			{
				driver.findElement(By.xpath("(//div[@class='_3879cV'])[18]")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 1 Star and above Rating checkbox$")
			public void Check_Rating_oneStar()
			{
				boolean a=driver.findElement(By.xpath("(//div[@class='_3879cV'])[18]")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
				
			}
			@Given ("^User click on Internal Storage dropdown$")
			public void InernalStorage()
			{
				driver.findElement(By.xpath("//div[text()='Internal Storage']")).click();
			}
			@When ("^User click on 256 GB & Above$")
			public void InternalStorage_1() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='256 GB & Above']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 256 GB & Above checkbox$")
			public void Check_InternalStorage_1()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='256 GB & Above']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
			}
			@When ("^User click on 128 - 255.9 GB$")
			public void InternalStorage_2() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='128 - 255.9 GB']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 128 - 255.9 GB checkbox$")
			public void Check_InternalStorage_2()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='128 - 255.9 GB']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
			}
			@When ("^User click on 64 - 127.9 GB$")
			public void InternalStorage_3() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='64 - 127.9 GB']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 64 - 127.9 GB checkbox$")
			public void Check_InternalStorage_3()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='64 - 127.9 GB']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
			}
			@When ("^User click on 32 - 63.9 GB$")
			public void InternalStorage_4() throws InterruptedException
			{
				driver.findElement(By.xpath("//div[text()='32 - 63.9 GB']")).click();
				Thread.sleep(2000L);
			}
			@Then ("^User able to select 32 - 63.9 GB checkbox$")
			public void Check_InternalStorage_4()
			{
				boolean a=driver.findElement(By.xpath("//div[text()='32 - 63.9 GB']")).isSelected();
				if(a=true)
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
			}
}
